package bmi.models;

public class CalculateModel {
	public void execute(ResultModel person){
		double Htdouble = person.getHeight();
		double Wtdouble = person.getWeight();
		double bmi = Wtdouble/(Htdouble/100*Htdouble/100);
		person.setBmi(bmi);

		String bodyType;
		if(Htdouble < 0 && Wtdouble < 0){
			bodyType = "Please try it again";
		}else if (bmi < 18.5){
			bodyType = "Your bodytype is Thinness";
		}else if (bmi >= 18.5 && bmi < 25.0){
			bodyType = "Your bodytype is Normal";
		}else if (bmi >= 25.0 && bmi < 30.0){
			bodyType = "Your bodytype is Overweight";
		}else if (bmi >= 30.0 && bmi < 35.0){
			bodyType = "Your bodytype is ObeseClassI";
		}else if (bmi >= 35.0 && bmi < 40.0){
			bodyType = "Your bodytype is ObeseClassII";
		}else if (bmi >= 40.1){
			bodyType = "Your bodytype is ObeseClassIII";
		}else{
			bodyType = "Please try it again";
		}
		person.setBodyType(bodyType);
	}

}

