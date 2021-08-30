public class _10_Question5 {
    public String name;
    public void view()
    {
        System.out.println("Welcome " + name);
    }
}
class question5
{
    public static void main(String[] args) {
        _10_Question5 obj = new _10_Question5();
        obj.name = args[0];
        obj.view();
    }
}
