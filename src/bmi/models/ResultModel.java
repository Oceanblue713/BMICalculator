package bmi.models;

public class ResultModel {

	private double Htdouble;
	private double Wtdouble;
	private String bmI;
	private String bodyType;

	public ResultModel(){
	}

	public ResultModel(double Htdouble, double Wtdouble, String bmI, String bodyType){
		this.Htdouble = Htdouble;
		this.Wtdouble = Wtdouble;
		this.bmI = bmI;
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

	public String getBmi(){
		return this.bmI;
	}

	public void setBmi(String bmI){
		this.bmI = bmI;
	}

	public String getBodyType(){
		return this.bodyType;
	}

	public void setBodyType(String bodyType){
		this.bodyType = bodyType;
	}

}

