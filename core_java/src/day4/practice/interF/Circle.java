package day4.practice.interF;

public interface Circle {
    
    //By default variables are static and final and values cannot be changed
    static final double pie = 3.14; 
    
    // Methods are by default abstract in interface no need to mention abstract
    public abstract void areaOfCircle( double radius); 
    public abstract void circumference( double radius); 
    //public abstract void input();    

 

}