package bmi.models;

import java.math.BigDecimal;

public class CalculateModel {

	public static double getBmi(ResultModel person){

		double Htdouble = person.getHeight()*0.01;
		double Wtdouble = person.getWeight()*1.0;

		double bmi = Wtdouble/(Htdouble*Htdouble);
		BigDecimal bmiBig = new BigDecimal(bmi);
		bmiBig = bmiBig.setScale(1, BigDecimal.ROUND_HALF_UP);

		if(Htdouble < 0 && Wtdouble < 0){
			System.out.println("Please put in exact number.");
		}else if (bmi < 18.5){
			System.out.println("Your category is Thinness");
		}else if (bmi >= 18.5 && bmi < 25.0){
			System.out.println("Your category is Normal");
		}else if (bmi >= 25.0 && bmi < 30.0){
			System.out.println("Your category is Overweight");
		}else if (bmi >= 30.0 && bmi < 35.0){
			System.out.println("Your category is ObeseClassI");
		}else if (bmi >= 35.0 && bmi < 40.0){
			System.out.println("Your category is ObeseClassII");
		}else if (bmi >= 40.1){
			System.out.println("Your category is ObeseClassIII");
		}else{
			System.out.println("Please try it again");
		}
		return bmi;
	}

}
