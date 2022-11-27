package K.Constructors;

public class ConstParameter {
    int modelYear;
    String modelName;
    ConstParameter(int Year, String Name){
        modelYear=Year;
        modelName=Name;
    }

    public static void main(String[] args) {
        ConstParameter obj1=new ConstParameter(2015,"BMW");
        System.out.println(obj1.modelYear+" "+obj1.modelName);

    }

}
