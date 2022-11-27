package I.Object;

public class Student {
    String Name;
    int id;
    int age;

    public void data(String Name,int id,int age) {
        System.out.println(Name+" "+id+" "+age);


    }
    public static void main(String[] args) {

        Student s=new Student();
        s.data("Sagar",100,25);
        s.data("Hiren",105,30);

     //   System.out.println("Student name" +"="+s.Name);
      //  System.out.println("Student id"+"="+s.id);
       // System.out.println("Student age"+"="+s.age);


    }
}






     /*  Student S=new Student();
        S.Name="Sagar";
        S.id=100;
        S.age=25;
        System.out.println(S.Name+"="+S.id);
        System.out.println("Age"+"="+S.age);*/





