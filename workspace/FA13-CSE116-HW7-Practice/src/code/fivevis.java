package code;
import code.LRStruct.*;
public class fivevis implements  IAlgo<Integer,Integer,Object> {

	
	
	public int greaterThanFive(int x){
		
		
		int y = 0;
		if (x>5){
			 y =1;
			
		}
		else if (x<0){
			y=0;
		}
		return y;
	}

	@Override
	public Integer emptyCase(LRStruct<Integer> host, Object arg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer nonEmptyCase(LRStruct<Integer> host, Object arg) {
		 
		return host.getRest().execute(this, greaterThanFive(host.getDatum()));
				
	}

	

	

	

}

