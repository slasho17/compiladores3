/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

import java.io.*;

public class IfStatement extends Statement{

  //atributos:
  private Expr expr;
  private StatementList thenPart;
  private StatementList elsePart;

  //metodos:
  public IfStatement( Expr expr, StatementList then, StatementList elsePart){
    this.thenPart = then;
    this.elsePart = elsePart;
    this.expr = expr;
  }

  public Expr getIfExpr(){
    return this.expr;
  }

  public StatementList getThenPart(){
    return this.thenPart;
  }

  public StatementList getElsePart(){
    return this.elsePart;
  }

  public void genC(PW pw) {
    pw.print("if (");
    this.expr.genC(pw);
    pw.out.print(") ");

    pw.out.println("{");
    pw.add();
    this.thenPart.genC(pw);
    pw.sub();
    pw.println("}");

    if(this.elsePart != null){
      pw.print("else ");
      pw.out.println("{");
      pw.add();
      this.elsePart.genC(pw);
      pw.sub();
      pw.println("}");
    }
  }
}
