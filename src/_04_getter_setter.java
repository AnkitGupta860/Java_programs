public class _04_getter_setter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class studentName1
{
    public static void main(String[] args) {
        _04_getter_setter obj1 = new _04_getter_setter();
        obj1.setName("Ankit");
        String sc = obj1.getName();
        System.out.println(sc);
    }
}
