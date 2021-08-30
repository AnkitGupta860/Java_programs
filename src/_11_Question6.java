public class _11_Question6 {
    public int int1;
    public int int2;
    public void sum(){
        System.out.println(int1+int2);
    }
}
class Question6
{
    public static void main(String[] args) {
        _11_Question6 obj = new _11_Question6();
        obj.int1 = Integer.parseInt(args[0]);
        obj.int2 = Integer.parseInt(args[1]);
        obj.sum();;
    }
}
