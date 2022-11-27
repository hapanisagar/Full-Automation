package R.Exception;

import java.sql.SQLOutput;

public class TryCatch2 {
    public static void main(String[] args) {
      try {
          int i = 10 / 0;
          System.out.println(i);
      }catch(Exception e){
          System.out.println("ArithmeticException");
      }
        System.out.println("Exception Handled");

    }
}
