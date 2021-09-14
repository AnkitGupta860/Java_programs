public class _23_StudentName {
    public String ss;
    public String name;
    public _23_StudentName(){
        System.out.println("Unknown");
    }
    public _23_StudentName(String ss){
        name = ss;
    }
}
class Student1
{
    public static void main(String[] args) {
        _23_StudentName obj = new _23_StudentName();
        obj.ss = "Ankit";
        System.out.println(obj.ss);
        System.out.println(obj.name);
    }
}
