public class _22_toString {
    public int a ; // instance variable
    public String name ;

    @Override
    public String toString() {
        return "DefinitionDemo{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        _22_toString obj = new _22_toString();  // object creation
        _22_toString obj1 = new _22_toString();
        obj1.a = 45;
        obj1.name = "neeraj";
        obj.a = 900; // initializing instance variable
        System.out.println(obj);  // printing the object
        System.out.println(obj1);
        // we will override toString method of the Object class.

    }
}
