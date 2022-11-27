package I.Object;

public class Car3 {
    int mod;
    int wheel;

    public static void main(String[] args) {
        Car3 obj1=new Car3();
        Car3 obj2=new Car3();

        obj1.mod=2015; //this is another way to intilaize variable
        obj2.wheel=4;

        System.out.println(obj1.mod);
        System.out.println(obj2.wheel);
    }
}
