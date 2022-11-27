package S.Superkeyword.Method;

public class JuniorTester {
     void display(){
         System.out.println("class for Junior Tester");

     }
}
class SeniorTester extends JuniorTester {
    void display() {
        System.out.println("Class for Junior Tester");
    }
    void Hello(){
        display();
        super.display();
    }

    public static void main(String[] args) {
        SeniorTester obj=new SeniorTester();
        obj.Hello();
    }


}