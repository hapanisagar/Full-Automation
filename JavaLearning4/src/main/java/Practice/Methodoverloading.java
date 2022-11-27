package Practice;

public class Methodoverloading {
    void total(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void total(int d,int e){
        System.out.println(d+e);

    }

    public static void main(String[] args) {


        Methodoverloading result=new Methodoverloading();
        result.total(3,6,9);
        result.total(5,7);
    }
}
