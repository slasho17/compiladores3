/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

import Lexer.*;

public class ExprUnary extends Expr {

  //atrubutos:
  private Symbol op;
  private Expr e;

  // metodos:
  public ExprUnary(Symbol op, Expr e){
    this.op = op;
    this.e = e;
  }

  public void genC(PW pw){
    if (this.op != null) {
      pw.out.print(this.op.toString());
      e.genC(pw);
    }else
      e.genC(pw);
  }

  public Type getType() {
    return e.getType();
  }

  public Expr getExpr() {
    return this.e;
  }

  public String getExprName() {
    return e.getExprName();
  }
}
