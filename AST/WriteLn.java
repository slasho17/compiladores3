/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

public class WriteLn extends Statement {

    private Expr e;
    public WriteLn(Expr e){
      this.e = e;
    }

    public void genC(PW pw){
    	if(this.e.getType().getTypeName() != "String") {
    		pw.print("printf(\"%d\\n\", ");
    		this.e.genC(pw);
    		pw.out.println(");");
    	}
    	else{
        		pw.print("puts(");
        		this.e.genC(pw);
        		pw.out.println(");");
    	}
    }
}
