public class _12_Question7 {
    public String city;
}
class Question7
{
    public static void main(String[] args) {
        _12_Question7 obj = new _12_Question7();
        obj.city = args[0];
        if(args.length==0){
            System.out.println("No Values");
        }
        else
        {
            System.out.print(args[0]);
            for(int k = 1;k< args.length;k++)
            {
                System.out.print(","+args[k]);
            }
        }
    }
}
