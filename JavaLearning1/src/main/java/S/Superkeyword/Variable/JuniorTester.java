package S.Superkeyword.Variable;

public class JuniorTester {

    int Salary =2000;

}
   class SeniorTester extends JuniorTester{
    int Salary=3000;
    void displaySalary(){
        System.out.println("Junior Tester Salary:"+super.Salary);
        System.out.println("Senior Tester Salary:"+Salary);
    }

       public static void main(String[] args) {
           SeniorTester obj=new SeniorTester();
           obj.displaySalary();
       }
   }
