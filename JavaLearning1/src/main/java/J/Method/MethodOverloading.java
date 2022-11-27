package J.Method;

public class MethodOverloading {
    static int plusMethod(int x,int y){
        return x+y;

    }
    static double plusMethod(double x,double y){
        return x+y;

    }
    static int plusMethod(int x){
        return x;
    }

    public static void main(String[] args) {
       int z= plusMethod(10,20);
     double zz= plusMethod(20.50,30.40);
     int zzz=plusMethod(10);

        System.out.println(z);
        System.out.println(zz);
        System.out.println(zzz);

    }
}
