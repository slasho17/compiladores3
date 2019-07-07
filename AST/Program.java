/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

import java.util.*;
import java.io.*;



public class Program{

		//atributos:
		private ArrayList<Function> arrayFunction;

		//construtor:
		public Program(ArrayList<Function> arrayFunction ){
			this.arrayFunction = arrayFunction;
		}

		//genc:
		public void	genC(PW pw){


			ParamList p;

			pw.out.println("#include<stdio.h>");
			pw.out.println("#include<string.h>");
			pw.out.println("");
			
			for(Function f : this.arrayFunction){
				if(f.getType() == null)
					pw.out.print("void " + f.getId() + "(" );
				else
					pw.out.print(f.getType().getCname() + " " + f.getId() + "(" );
				
				
				p = f.getParamList();
				
				if(f.getParamList() != null) {
					int length = p.size();				
					for(int i =0; i <length; i++ ){
	
						if( length != 0){
							
							pw.out.print(p.access(i).getType().getCname() + " "+ p.access(i).getId());
	
							if( i != p.size() - 1){
								pw.out.print(", ");
							}
						}
					}
				}
				pw.out.print(") ");
				pw.out.println("{");
				pw.add();
				f.genC(pw);
				pw.sub();
				pw.out.println("}");
				pw.out.println("");
			}
		}



}
