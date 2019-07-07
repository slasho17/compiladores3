/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

import java.io.*;

public class WhileStatement extends Statement{

  //atributos:
  private Expr whileExpr;
  private StatementList whileStmt;

  //metodos:
  public WhileStatement( Expr expr, StatementList stmt){
    this.whileStmt = stmt;
    this.whileExpr = expr;

  }

  public Expr getWhileExpr(){
    return this.whileExpr;
  }

  public StatementList getThenPart(){
    return this.whileStmt;
  }

  //genc
  public void genC(PW pw){
    pw.print("while("); 
    this.whileExpr.genC(pw);
    pw.out.print(") ");
    pw.out.println("{");
    pw.add();
    this.whileStmt.genC(pw);
    pw.sub();
    pw.println("}");
  }
}
