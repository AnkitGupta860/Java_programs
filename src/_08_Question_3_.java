
public class _08_Question_3_ {
    public String gender;
    public int age;
}
class Question3
{
    public static void main(String[] args) {
        _08_Question_3_ obj = new _08_Question_3_();
        obj.gender = args[0];
        obj.age = Integer.parseInt(args[1]);
        if(obj.gender == "Female" && obj.age>=1 && obj.age<=58){
            System.out.println("8.2%");
        }
        else if (obj.gender == "Female" && obj.age>=59 && obj.age<=100){
            System.out.println("9.2%");
        }
        else if (obj.gender == "Male" && obj.age>=1 && obj.age<=58){
            System.out.println("8.4%");
        }
        else if (obj.gender == "Male" && obj.age>=59 && obj.age<=100) {
            System.out.println("10.5%");
        }
    }
}
