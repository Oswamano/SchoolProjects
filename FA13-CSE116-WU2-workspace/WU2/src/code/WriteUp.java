package code;

public class WriteUp {
	
	public int[] solution(String s){
		int r[] = new int[3];
		int counta = 0;
		int countb = 0;
		int countc = 0;
		int size=s.length();
		int y =0;
		boolean bool = false;
		
		while(y<size){
		char c=s.charAt(y);
		
		if  (( 'a' <= c && c <= 't' )||( 'A' <= c && c<= 'T' )){
			bool=false;bool=false;
			int v=0;
			String check ="aclrACLR";
			 while (v<check.length()){
				if (c==check.charAt(v)){
					counta++;
					bool=true;
				}
				
				v++;
				 
			 }
			 if (bool==true){
				 countb++;
			 }
				 
			 
			 
			}
		else{
		countc++;
		}
			
		y++;	
		
			
		}
		
		
		
		
		
		
		
		
		r[0]=counta;
		r[1]=countb;
		r[2]=countc;
		
	return r;
		
		
		
		
	}
}

