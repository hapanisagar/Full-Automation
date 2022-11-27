package L.Array;

public class TwoDimArray {
    public static void main(String[] args) {
        int data[][] = new int[3][2];
        data[0][0] = 5;
        data[0][1] = 10;

        data[1][0] = 15;
        data[1][1] = 20;

        data[2][0] = 25;
        data[2][1] = 30;

        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < data[i].length; k++){

                System.out.print(data[i][k]+" ");

            }
            System.out.println();


        }
    }
}
