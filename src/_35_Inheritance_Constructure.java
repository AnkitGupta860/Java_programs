class Base
{
    public Base()
    {
        System.out.println("I am a Base class constructor");
    }
    public Base(int X)
    {
        System.out.println("Base class constructor value is "+X);
    }
}
class Derived extends Base
{
    public Derived()
    {
        System.out.println("I am derived class constructor");
    }
    public Derived(int X , int Y)
    {
        super(X);
        System.out.println("Derived class constructor value is "+Y);
    }
}
class Derivedfromchild extends Derived{
    public Derivedfromchild()
    {
        System.out.println("I am Derivedfromchild class constructor");
    }
    public Derivedfromchild(int X , int Y , int Z)
    {
        super(X,Y);
        System.out.println("Derivedfromchild class value is "+Z);
    }
}
public class _35_Inheritance_Constructure {
    public static void main(String[] args) {
        Derivedfromchild obj = new Derivedfromchild();
        Derivedfromchild obj1 = new Derivedfromchild(1,2,3);
    }
}
