// Matthew O'Connor Project Checkpoint 2 Cse 305
import org.antlr.runtime.*;
import java.util.*;
import java.io.*;
import java.nio.file.*

class Demo{
  public static void main(String[] args) throws Exception{
	FileOutputStream output = new FileOutputStream("sample.tok");
	String workingdir  = new String(Files.readAllBytes(Paths.get("samplea.lool"))); 
	CharStream input = new ANTLRStringStream(workingdir+   args[0]);// Handles arguments 
	PrintStream out = new PrintStream(output);
	LoolLexer lexor = new LoolLexer(input);// Handles the imput.
	TokenStream tokinator = new CommonTokenStream(lexor);// Makes a token stream for parsing the file
	LoolParser parser = new LoolParser(tokinator);
	while(true){// While x<file.length?
        	String str = parser.start();
		out.print(str);//Prints
		Token tokenz = lexor.nextToken();
              if(tokenz.getType() == Token.EOF ){
			break;}
//		else statement?		
	
            //Rules an stuff yo
		else if(tokenz.getType()==lexor.SYMB)// this giant if statement calls rules from the parser and is like the lexor somewhat.
			out.print(tokenz.getText()+"symbol ");

		else if(tokenz.getType()==lexor.Sum)
                      out.print(tokenz.getText()+ "+ "  );// compares to sum statement
		else if(tokenz.getType()==lexor.Minus)//minus statment
			out.print(tokenz.getText()+ "- ");
		else if (tokenz.getType()==lexor.Mult)
			out.print(tokenz.getText()+ "* ");
		else if (tokenz.getType()==lexor.Div)
			out.print(tokenz.getText() + "/ ");
				else if(tokenz.getType()==lexor.WS)
                        out.print(tokenz.getText()+ " " );
			else if(tokenz.getType()==lexor.MultiLineComment)
                        out.print(tokenz.getText()+ "MultipleLineComment ");
		
		else if(tokenz.getType()==lexor.SingleLineComment)
                       out.print(tokenz.getText());
		
		else if(tokenz.getType()==lexor.INT)
                       out.print(tokenz.getText()+ "Integer ");
		 statem
		
		else if(tokenz.getType()==lexor.ID)
                       out.print(tokenz.getText()+ "Identity ");
		else if(tokenz.getType()==lexor.STRINGLIT)
                       out.print(tokenz.getText()+ "String Literal ");// String lit rule
 	 }
	output.close();
	System.out.print("The File is done being PARSED");//end of file 
	}
}
