/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

abstract public class Expr {
    
    abstract public void genC(PW pw);
    abstract public Type getType();
    abstract public String getExprName();
}