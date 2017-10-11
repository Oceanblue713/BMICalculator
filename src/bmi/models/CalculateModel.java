package bmi.models;


public class CalculateModel {
	public void execute(ResultModel person){
		double Htdouble = person.getHeight();
		double Wtdouble = person.getWeight();
		double bmi = Wtdouble/(Htdouble/100*Htdouble/100);
		String bmI = String.format("%1$.1f",bmi);

		person.setBmi(bmI);

		String bodyType;
		if(Htdouble < 0 || Wtdouble < 0){
			bodyType = "You typed miss, Please try it again";
		}else if (bmi < 18.5){
			bodyType = "Thinness";
		}else if (bmi >= 18.5 && bmi < 25.0){
			bodyType = "Normal";
		}else if (bmi >= 25.0 && bmi < 30.0){
			bodyType = "Overweight";
		}else if (bmi >= 30.0 && bmi < 35.0){
			bodyType = "ObeseClass I";
		}else if (bmi >= 35.0 && bmi < 40.0){
			bodyType = "ObeseClass II";
		}else if (bmi >= 40.1){
			bodyType = "ObeseClass III";
		}else{
			bodyType = "Please try it again";
		}
		person.setBodyType(bodyType);
	}

}

