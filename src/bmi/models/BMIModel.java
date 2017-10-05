package bmi.models;

public class BMIModel {

	private String message = "";

	public void setMessage(String value){
		this.message = value;
	}

	public String getMessage(){
		return this.message;
	}

	private double height = 0.0;
	private double weight = 0.0;

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return this.height;
	}


	public void setWeight(double weight){
		this.weight = weight;
	}

	public double getWeight(){
		return this.weight;
	}

}
