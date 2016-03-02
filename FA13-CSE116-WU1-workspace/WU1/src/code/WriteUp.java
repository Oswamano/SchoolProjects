package code;

public class WriteUp {
	
	public char solution (String s, char c1, char c2 ){
		
		int x = 0;
		int y =0;
		int count1=0;
		int count2=0;
			char back = 'x';
		int length = s.length();
		while(x<length){
			if (c1==s.charAt(x)){
				count1=count1+1;
				
			}
		x++;		
		}
		while(y<length){
			if (c2==s.charAt(y)){
				count2=count2+1;
				
			}
		y++;		
		}
		
		if (count1>=count2){
			back= c1;
		}
		else if (count2>count1){
			back= c2;
		}
		x=0;
		y=0;
		return back;
		
	}

}
