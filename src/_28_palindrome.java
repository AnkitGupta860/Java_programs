import java.util.Scanner;

public class _28_palindrome {
    public static void main(String[] args) {
        int temp=0,number,x,r;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        x = number;
        while(number>0)
        {
            r = number%10;
            number = number/10;
            temp = (temp*10)+r;
        }
        if(temp==x)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}
