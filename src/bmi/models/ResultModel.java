package bmi.models;

public class ResultModel {


	private double Htdouble = 0.0;
	private double Wtdouble = 0.0;

	public ResultModel(){
	}

	public ResultModel(double Htdouble, double Wtdouble){
		this.Htdouble = Htdouble;
		this.Wtdouble = Wtdouble;
	}

	public void setHeight(double Htdouble){
		this.Htdouble = Htdouble;
	}

	public double getHeight(){
		return this.Htdouble;
	}


	public void setWeight(double Wtdouble){
		this.Wtdouble = Wtdouble;
	}

	public double getWeight(){
		return this.Wtdouble;
	}
}

