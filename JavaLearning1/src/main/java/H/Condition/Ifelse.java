package H.Condition;

import java.net.PortUnreachableException;

public class Ifelse {
    public static void main(String[] args) {
        int income = 12000;
        if (income > 12570) {
            System.out.println("Liable for tax");
            System.out.println("Taxable income=" + (income - 12570));}

        else{
            System.out.println("Not Liable for tax");


        }
        }

    }

