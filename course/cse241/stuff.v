 ckage code;

import java.util.ArrayList;

public class MakeUp {
	public ArrayList<Integer> createList(int start, int stop, int step){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int x = start;x<=stop;x=x+step){
		ret.add(x);	
		}
		return ret;
		
	}
	
	public int[] zip(int[]r, int[]s){
		int y = (r.length+s.length);
		int []ret = new int[y];
		for(int x=0;x<y;x++){
		if ((x%2)==0){
			System.out.println("even");
			
			int a = x/2;
			if (x==0){
			ret[x]=r[x];
			x++;
			}
			
			else if (x==2){
				ret[x]=r[1];
				x++;
				}
			
			else {
				ret[x]=r[a];
				System.out.println (r[x/2]);
				x++;
				}
			
		}
		else if (x%2!=0){
			System.out.println("odd");
			
			
			if (x==1){
			ret[x]=s[0];
			x++;
			}
			
			else{
				ret[x]=s[(x-1)/2];
				System.out.println(s[(x-1)/2]);
				x++;
		}
			
		System.out.println("x"+x);
		
	}
	
	
}
		return ret;
}
}

