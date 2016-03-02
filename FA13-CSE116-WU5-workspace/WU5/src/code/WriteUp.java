package code;

public class WriteUp {
	public String bmiCategory(double bmi){
		String bmistring = "";
		if(bmi<0){
		throw new IllegalArgumentException();
	
			}
		else if (bmi<18.5){
		bmistring = "Underweight";	
		}
		else if(bmi<25.0){
			bmistring="Normal";
		}
		else if(bmi<30.0){
			bmistring="Overweight";
		}
		else if(bmi>=30.0){
			bmistring="Obese";
		}
		
		return bmistring;
		
		
		
		
	}

}
