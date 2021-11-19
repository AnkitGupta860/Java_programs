interface MyCamera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void record4kVideo()
    {
        greet();
        System.out.println("Recording 4k video");
    }
}
interface MyWifi
{
    String [] searchingNetwork();
    void connectNetwork(String Network);
}
class MyCellPhone
{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi
{
    public void takeSnap()
    {
        System.out.println("Taking snap");
    }
    public void recordVideo()
    {
        System.out.println("Recording video");
    }
    public String [] searchingNetwork()
    {
        System.out.println("Getting Network");
        String [] GettingNetwork = {"Ankit","Rohan"};
        return GettingNetwork;
    }
    public void connectNetwork(String Network)
    {
        System.out.println("Connecting "+Network);
    }

}
public class _42_interfaces {
    public static void main(String[] args) {
        MySmartPhone obj = new MySmartPhone();
        obj.recordVideo();
        String [] ar = obj.searchingNetwork();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
