/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/
/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

import java.io.*;
import Lexer.*;

public class VarDecStat extends Statement{

    //atributos:
    private Variable varDecStat;

    //metodos:
    public VarDecStat(Variable v){
        this.varDecStat = v;
    }

    //genc
    public void genC(PW pw){
        pw.print(varDecStat.getType().getCname());
        pw.out.print(" ");
        pw.out.print(varDecStat.getId());
        // Se for do tipo string, precisa do '[]' depois do id da variavel
        // Pois string eh um vetor de char
        if (varDecStat.getType().getTypeName().equals("String")) {
            pw.out.print("[10000]"); //gambiarraaaaa
        }
        pw.out.println(";");
    }
}