package code;

public class Homework1Practice {
	
	public int count_e (String s){
		int count = 0;
		int length = s.length();
		int x = 0;
	while(x<length){
			if(s.charAt(x)=='e'){
				count++;
			}
			x++;
		}
		return count;
		}
	
	public int count_f (String s){
		int count = 0;
		int length = s.length();
		int x = 0;
		
		
		
		while(x<length){
			if(s.charAt(x)=='f'){
				count++;
			}
			x++;
		}
		
		return count;
		
		
	}
	
	public int count_one_char (String s,char c){
		int count = 0;
		int length = s.length();
		int x =0;
		
		
		
		while(x<length){
			if(s.charAt(x)==c){
				count++;
			}
			x++;
		}
		
		return count;
		
		
	}
	public int count_two_chars (String s,char c,char d){
		int count = 0;
		int length = s.length();
		int x =0;
		
		
		
		while(x<length){
			if(s.charAt(x)==c){
				count++;
			}
			
			if(s.charAt(x)==d){
				count++;
			}
			x++;
		}
		
		return count;
		
		
	}
	public int count_chars_in_String(String s,String characters){
		int count = 0;
		int length = s.length();
		int charlength=characters.length();
		int x =0;
		int y =0;
		
		
		
		while(y<charlength){
			char a = characters.charAt(y);
			while(x<length){
				char b = s.charAt(x);
				if(b==a){
					count++;
				}
				x++;
				
			}
			x=0;
			y++;
			}
		
		return count;
		
		
	}

}
