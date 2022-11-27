package L.Array;

public class SingalDimArray {
    public static void main(String[] args) {
        //int a[]=new int[5]; //declared array with size 5, starting index is 0 and last index no is 4
       /* a[0]=100; //storing value in array
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/

        int a[]={100,200,300,400,500,}; //this another way to declare array without specifying size of array

       // System.out.println(a.length);
      //  System.out.println(a[2]);
        for(int i=0;i<a.length;i++) //simple for loop (we can use i<5 as well insted of a.lenght)
        {
            System.out.println(a[i]);
     /*  for(int i:a)     //enhanced for loop specially for array
        {
            System.out.println(i);*/


        }
    }
}
