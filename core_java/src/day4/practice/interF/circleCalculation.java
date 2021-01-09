package day4.practice.interF;

public class circleCalculation implements Circle {
   
    @Override
    public void areaOfCircle(double radius) {
        
        double circleArea = (pie * radius *radius);
        System.out.println("Area of Circle is :" + circleArea);
        
        }
    @Override
    public void circumference(double radius) {
        
        double circum =  (2 * pie * radius);
        System.out.println("Circumference of Circle is :" + circum);    
        
    }
}
