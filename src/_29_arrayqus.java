import java.util.Scanner;

public class _29_arrayqus {
    int [] number;
    public _29_arrayqus()
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        number = new int[n];
        for(var i=0;i<number.length;i++)
        {
            number[i] = s.nextInt();
        }
    }
    public void search()
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int flag=0;
        for(int i = 0;i<number.length;i++)
        {
            if(m==number[i])
            {
                flag = i;
                break;
            }
            else
            {
                flag = -1;
            }
        }
        System.out.println(flag);
    }
}
class arrayquss
{
    public static void main(String[] args) {
        _29_arrayqus obj = new _29_arrayqus();
        obj.search();
    }
}
