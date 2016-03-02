package code;

import java.util.HashMap;

import util.general.CharacterFromFileReader;

public class WriteUp {
	
	public HashMap<String,String> solution (String s){
	HashMap<String,String> hash = new HashMap<String,String>();	
	CharacterFromFileReader read = new CharacterFromFileReader(s);
	String temp = new String();
	String prev = new String();
	
	while(read.hasNext()==true){
		char x = read.next();
		if(x==':'){
			hash.put(temp, "");
			prev=temp;
			temp="";
		}
		else if(x=='\n'){
		hash.put(prev, temp);
		temp="";
		
		}
		else{
			temp+=x;
			
			
		}
		
	}
	
	
	return hash;
		
		
	}
	
	
	}
	


