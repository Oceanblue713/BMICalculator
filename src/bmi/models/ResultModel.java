package bmi.models;

public class ResultModel {

	private double Htdouble;
	private double Wtdouble;
	private double bmi;
	private String bodyType;

	public ResultModel(){
	}

	public ResultModel(double Htdouble, double Wtdouble, double bmi, String bodyType){
		this.Htdouble = Htdouble;
		this.Wtdouble = Wtdouble;
		this.bmi = bmi;
		this.bodyType = bodyType;

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

	public double getBmi(){
		return this.bmi;
	}

	public void setBmi(double bmi){
		this.bmi = bmi;
	}

	public String getBodyType(){
		return this.bodyType;
	}

	public void setBodyType(String bodyType){
		this.bodyType = bodyType;
	}

}

