package Objectpractice;

public class string {
    static void stock(String name,int qty,String unit){
        System.out.println(name +qty+ unit);

    }

    public static void main(String[] args) {

        stock("Kit kat -" ,3 ,"pack");
        stock("dairy milk -",10,"pack");
        stock("milk -",2,"littere");
    }
}
