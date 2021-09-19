import java.util.Scanner;

public class _31_succedingorder {
    int [] arr;
    public _31_succedingorder()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        arr = new int[n];
        for(int i = 0 ;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
    }
    public void sum()
    {
        boolean add = true;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=6 && add==true)
            {
                sum+=arr[i];
            }
            else if(arr[i]==6)
            {
                add=false;
            }
            else if(arr[i]==7)
            {
                add=true;
            }
        }
        System.out.println(sum);


    }
}
class succedingorder1
{
    public static void main(String[] args) {
        _31_succedingorder obj = new _31_succedingorder();
        obj.sum();
    }
}
