

//()
interface vehicle{

    //variables are by default public/static/final
    String x = "Demo";

    //By default, methods are abstract/public, now with Java you can have default methods as well that don't need to be overridden.
    void VehicleMake();
}

//Class can implement more than 1 Interface
public class InterfaceDemo implements vehicle{

    public void VehicleMake(){
        System.out.println("Vehicle make is Hyundai");
    }

    public static void main (String args[]){
        //Creating interface reference, as you cannot create a object of interface
        vehicle v = new InterfaceDemo();
        v.VehicleMake();
        System.out.println("String value: "+v.x);
    }
}
