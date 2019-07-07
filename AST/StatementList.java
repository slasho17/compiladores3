/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

import java.io.*;
import java.util.*;

public class StatementList {

  //atributos:
  private ArrayList<Statement> v;

  public StatementList(ArrayList<Statement> v) {
      this.v = v;
  }

  public void genC(PW pw){

    for( Statement s : this.v){
      s.genC(pw);
    }
  }
}
