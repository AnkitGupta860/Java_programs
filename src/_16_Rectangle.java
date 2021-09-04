import java.util.Scanner;
public class _16_Rectangle {
    public int length;
    public int breath;
    public void Area()
    {
        System.out.println("Area of Rectangle : "+(length*breath));
    }
}
class Rectangle
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        _16_Rectangle obj1 = new _16_Rectangle();
        obj1.length = obj.nextInt();
        obj1.breath = obj.nextInt();
        obj1.Area();
        _16_Rectangle obj2 = new _16_Rectangle();
        obj2.length = obj.nextInt();
        obj2.breath = obj.nextInt();
        obj2.Area();
    }
}
