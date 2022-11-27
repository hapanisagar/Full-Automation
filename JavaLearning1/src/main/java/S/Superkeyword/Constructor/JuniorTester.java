package S.Superkeyword.Constructor;

public class JuniorTester {
    int Salary;

    JuniorTester(int Salary){
        this.Salary=Salary;

    }
}
    class SeniorTester extends JuniorTester{
    int Salary;
    SeniorTester(int SalJunior, int SalSenior){
        super(SalJunior);
        Salary=SalSenior;
    }
    void display(){
        System.out.println("Senior Tester Salary:"+ Salary +" "+"Junior Tester:"+super.Salary);

    }

        public static void main(String[] args) {
            SeniorTester obj=new SeniorTester(3000,7000);
            obj.display();

            }


        }





