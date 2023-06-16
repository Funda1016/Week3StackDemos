package StackDemo;

public class Car {

	
	
	String make;
	int year;
	public Car(String make, int year) {
		super();
		this.make = make;
		this.year = year;
	}
	//bunlar icin main methodu delete yapiyoruz
	public Car() {
		super();
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
		

	

}
//getter setter constactarlari ypa