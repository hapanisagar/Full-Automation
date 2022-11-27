package N.Polymorphism;

import M.Inheritance.Bike;
import M.Inheritance.Vehicle;

public class Runtest2 {
    public static void main(String[] args) {
        System.out.println("Vehicle"); // In Polymorphism (Method overriding)concept Method name are same but method  Body are different
        Vehicle v=new Vehicle();
        v.noOfWheel();

        System.out.println("Bike");
        Bike B1=new Bike();
        B1.noOfWheels();


    }
}
