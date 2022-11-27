package R.Exception;

public class TryCatch {
    public static void main(String[] args) {
     try {
         int ar[] = {1, 2, 3, 4};
         for (int i = 0; i < 5; i++)
             System.out.println(ar[i]);
     }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Array size is not right");
         System.out.println("Exception Handled");
     }
    }
}
