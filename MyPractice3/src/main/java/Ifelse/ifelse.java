package Ifelse;

public class ifelse {
    public static void main(String[] args) {
        int percentage=50;
        if(percentage>90){
            System.out.println("Result ="+"First class");
        }else if(percentage<=90&&percentage>75){
            System.out.println("Result ="+"Second class");
        } else if (percentage<=75&&percentage>50){
            System.out.println("Result ="+"Pass class");
        } else {System.out.println("Result ="+"Fail");}

    }
}



