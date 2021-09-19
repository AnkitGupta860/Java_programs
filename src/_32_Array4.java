import java.util.Scanner;

public class _32_Array4 {
    int [] arr;
    public _32_Array4()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        arr = new int[n];
        for(int i = 0 ;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
    }
    public void Display()
    {
        boolean app = true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1 || arr[i]==4)
            {
                app=true;
            }
            else
            {
                app=false;
                break;
            }
        }
        System.out.println(app);
    }
}
class trueorfalse
{
    public static void main(String[] args) {
        _32_Array4 obj = new _32_Array4();
        obj.Display();
    }
}
