package code;

import java.util.HashMap;

import util.general.CharacterFromFileReader;

public class HomeWork {
	public HashMap<String,Integer> solution(String s){
		HashMap<String, Integer> map = new HashMap <String,Integer>();
		int x = 0;
		CharacterFromFileReader read = new CharacterFromFileReader(s);
		String author = "";
	
		while(read.hasNext()){
		char c = read.next();
		switch(x){
		case 1:
			if (read.next()=='{'){
				x=2;
			}
			
		break;
		case 2:
			if (read.next()=='A'){
				x=3;
			}
			break;
		case 3:
			if (read.next()=='}'){
				x=4;
			}
			break;
		case 4:
			if (read.next()=='{'){
				x=5;
			}
			
			else{
				author+=c;
			}
				
			
			
			break;
			case 5:
				if (read.next()=='a'){
					x=6;
				}
				
				else{
					author+='{';
					author+=c;
					x=4;
				}
			
			break;
			case 6:
			if (read.next()=='}'){
				x=1;
				if (map.containsKey(author)){
				int z = map.get(author);
				map.put(author,z+1);
				author="";
				x=1;
				}
				else{
					map.put(author, 1);
					author="";
					x=1;
				}
				
				}
			else if(c=='{'){
				author+='{';
				author+='a';
				author+='{';
				x=5;
				
				
			}
			
			else{
				author+='{';
				author+='a';
				author+=c;
				x=4;
			}	
			
			
			break;
	
		
			
			
		
		
		
		}
		
		}
		
			
		
		
		
			
		
		
		
		
		
		
		
		
		System.out.println(map);
		return map;
		
	

}
}
