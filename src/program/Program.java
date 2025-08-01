package program;

import Triangle.Triangle;

public class Program {
    public void run(){
        Triangle defaultTriangle= new Triangle();
        System.out.println("default"+defaultTriangle);
        Triangle equilateral=new Triangle(2.0);
        System.out.println("EQ"+equilateral);
        Triangle isosceles=new Triangle(5.0,9.0);
        System.out.println("iso"+isosceles);
        Triangle triangle=new Triangle(3,8,5);
        //not completed

    }
}
