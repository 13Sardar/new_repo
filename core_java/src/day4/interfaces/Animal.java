package day4.interfaces;
//Once We Declare Interface, everything inside it will be ABSTRACT by default, We can add abstract keyword but dosen't matter much.
public interface Animal {
// in interface Variable have to be constant.
//variables declared inside an interface are by default static and final.
	int count = 10;
	public void animalSound();
	public void sleep();

}
