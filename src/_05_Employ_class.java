public class _05_Employ_class {
    public String Ename;
    public int Esalary;
    public String desig;

    public void displayValue()
    {
        System.out.println(Ename + "    " + Esalary + "    " + desig);
    }
}
class EmployeeMain{
    public static void main(String[] args) {
        _05_Employ_class obj1 = new _05_Employ_class();
        obj1.Ename = args[0];
        obj1.Esalary = Integer.parseInt(args[1]);
        obj1.desig = args[2];
        obj1.displayValue();
    }
}
