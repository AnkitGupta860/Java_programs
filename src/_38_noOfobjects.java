public class _38_noOfobjects {
    static int noOfobjects = 0;
    {
        noOfobjects+=1;
    }
    public _38_noOfobjects()
    {
    }
    public _38_noOfobjects(int n)
    {
    }
    public _38_noOfobjects(String s)
    {
    }

    public static void main(String[] args) {
        _38_noOfobjects obj1 = new _38_noOfobjects();
        _38_noOfobjects obj2 = new _38_noOfobjects(2);
        _38_noOfobjects obj3 = new _38_noOfobjects("String");
        System.out.println(obj1.noOfobjects);
    }
}
