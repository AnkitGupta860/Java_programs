
public class _08_Question_3_ {
    public String gender;
    public int age;
    public void percentage()
    {
        if(gender.equals("Female") && age>=1 && age<=58){
            System.out.println("8.2%");
        }
        else if (gender.equals("Female") && age>=59 && age<=100){
            System.out.println("9.2%");
        }
        else if (gender.equals("Male") && age>=1 && age<=58){
            System.out.println("8.4%");
        }
        else if (gender.equals("Male") && age>=59 && age<=100) {
            System.out.println("10.5%");
        }
    }
}
class Question3
{
    public static void main(String[] args) {
        _08_Question_3_ obj = new _08_Question_3_();
        obj.gender = args[0];
        obj.age = Integer.parseInt(args[1]);
        obj.percentage();

    }
}
