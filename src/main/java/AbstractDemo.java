
abstract class Vehicle{
    //variables can have any access modifiers
    protected String x = "Demo";

    //methods can be abstract or default methods
    abstract void vehiclePrice();

    public void vehicleMake(){
        System.out.println("vehicle make is BMW");
    }
}

public class AbstractDemo extends Vehicle{
    void vehiclePrice(){
        System.out.println("vehicle price is 40 lacs");
    }

    public void vehicleModel(){
        System.out.println("vehicle model is 3 series");
    }

    public static void main(String[] args){
        Vehicle v = new AbstractDemo();
        AbstractDemo z = new AbstractDemo();
        v.vehicleMake();
        v.vehiclePrice();
        z.vehicleModel();
        System.out.println("String value: "+v.x);
    }
}
