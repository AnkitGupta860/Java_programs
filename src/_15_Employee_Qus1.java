public class _15_Employee_Qus1 {
    public String Name;
    public String Year;
    public String Add;

    public void view()
    {
        System.out.println(Name+"\t"+Year+"\t \t \t"+Add+"\t");
    }
}
class Employee
{
    public static void main(String[] args) {
        System.out.println("Name\t"+"Year of Joining\t"+"Address\t");
        _15_Employee_Qus1 obj1 = new _15_Employee_Qus1();
        obj1.Name = "Aman";
        obj1.Year = "2021";
        obj1.Add = "Chandigarh";
        obj1.view();
        _15_Employee_Qus1 obj2 = new _15_Employee_Qus1();
        obj2.Name = "Sunil";
        obj2.Year = "2000";
        obj2.Add = "Mathura";
        obj2.view();
        _15_Employee_Qus1 obj3 = new _15_Employee_Qus1();
        obj3.Name = "Rohan";
        obj3.Year = "2010";
        obj3.Add = "Agra";
        obj3.view();
    }
}
