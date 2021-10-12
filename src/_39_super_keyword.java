class base1
{
    base1(){
        System.out.println("I am a base class constructor");
    }
    base1(int x)
    {
        System.out.println("I am a base class constructor with value x"+x);
    }
}
class derived2 extends base1
{
    derived2()
    {
        System.out.println("I am derived class constructor");
    }
    derived2(int x,int y)
    {
        super(x);
        System.out.println("I am derived class constructor with value y"+y);
    }
}
class derived1 extends derived2
{
    derived1()
    {
        System.out.println("I am derived1 class constructor");
    }
    derived1(int x,int y, int z)
    {
        super(x, y);
        System.out.println("I am derived1 class constructor with value z"+z);
    }
}
public class _39_super_keyword {
    public static void main(String[] args) {
        derived1 obj = new derived1(1,2,3);
    }
}
