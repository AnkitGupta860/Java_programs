import java.util.Scanner;

//Q1. Create a class Car having properties manufacturer and price.
// Create three instances of the class and display the details of each car sorted with respect to the price.
public class _37_Qus1_Car {
    String manufacturer;
    int price;
    public _37_Qus1_Car(String manufacturer,int price)
    {
        this.manufacturer = manufacturer;
        this.price = price;
    }
    public void display()
    {
        System.out.println("Manufacturer : "+ manufacturer+"\n"+"Price : "+price);
    }
}
class car
{
    public static void main(String[] args) {
        _37_Qus1_Car obj1 = new _37_Qus1_Car("maruti",1);
        _37_Qus1_Car obj2 = new _37_Qus1_Car("Honda",2);
        _37_Qus1_Car obj3 = new _37_Qus1_Car("MG",3);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
