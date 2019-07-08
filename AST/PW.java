/*Bruno Veiga - 743514
Lucas Costa - 743563
Luiz Felipe Guimarães - 743570
Thiago Borges - 613770*/

package AST;

import java.io.*;

public class PW {
	private int step = 4;
	public PrintWriter out;
	private int currentIndent = 0;
	
	public void add() { 
		currentIndent += step; 
	} 
	public void sub() { 
		currentIndent -= step; 
	}
	public void set( PrintWriter out ) {
		this.out = out; 
		currentIndent = 0; 
	}
	public void set( int indent ) { 
		currentIndent = indent; 
	}
	public void print( String s ) {
		for (int i = 0; i < currentIndent; i++)
			out.print(" "); 
		out.print(s); 
	}
	public void println( String s ) {
		for (int i = 0; i < currentIndent; i++)
			out.print(" "); 
		out.println(s); 
	}
}
