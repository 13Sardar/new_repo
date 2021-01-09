package day6.defaultMethodInterface;

public class Car implements Vehicle, FourWheeler{
	public void print() {
	
	Vehicle.super.print();
	FourWheeler.super.print();

}
}
