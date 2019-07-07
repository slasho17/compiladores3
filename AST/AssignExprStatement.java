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

    public void genC() {
      //System.out.println(this.left.getClass().getSimpleName());
      if (this.right != null && this.right.getExprName().equals("ReadString")) {
    	  System.out.print("gets(");
    	  left.genC();
    	  System.out.println(");");
      } else if (this.right != null && this.right.getExprName().equals("ReadInt")) {
    	  System.out.print("scanf(\"%d\\n\", &");
    	  left.genC();
    	  System.out.println("); ");
      } else if(this.left.getType() != null && this.left.getType().getTypeName().equals("String")) {
    	  System.out.print("strcpy(");
    	  this.left.genC();
    	  System.out.print(",");
    	  this.right.genC();
    	  System.out.println(");");
      } else {
    	  this.left.genC();

          if (this.right != null) {
            System.out.print(" = ");
            this.right.genC();
          }   
          System.out.println(';');  
      }
    }
  }
