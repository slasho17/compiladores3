/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;
import java.io.*;
import Lexer.*;
import java.util.*;


public class AssignExprStatement extends Statement {

    //atributos:
    private Expr right;
    private Expr left;

    public AssignExprStatement( Expr left, Expr right ) {
        this.left = left;
        this.right = right;
    }

    public void genC(PW pw) {
      //System.out.println(this.left.getClass().getSimpleName());
      if (this.right != null && this.right.getExprName().equals("ReadString")) {
    	  pw.print("gets(");
    	  left.genC(pw);
    	  pw.out.println(");");
      } else if (this.right != null && this.right.getExprName().equals("ReadInt")) {
    	  pw.print("scanf(\"%d\\n\", &");
    	  left.genC(pw);
    	  pw.out.println("); ");
      } else if(this.left.getType() != null && this.left.getType().getTypeName().equals("String")) {
    	  pw.print("strcpy(");
    	  this.left.genC(pw);
    	  pw.out.print(",");
    	  this.right.genC(pw);
    	  pw.out.println(");");
      } else {
        pw.print("");
    	  this.left.genC(pw);

          if (this.right != null) {
            pw.out.print(" = ");
            this.right.genC(pw);
          }   
          pw.out.println(";");  
      }
    }
  }
