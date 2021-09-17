import java.util.Scanner;
public class Array25 {
    private int rollno;
    private String name;
    int marks[];
    public Array25()
    {
        Scanner s = new Scanner(System.in);
        rollno = s.nextInt();
        s.nextLine();
        name = s.nextLine();
        marks = new int[5];
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = s.nextInt();
        }
    }
    public static void display()
    {
        Array25 arr1[] = new Array25[2];
        for(int j = 0;j<arr1.length;j++)
        {
            arr1[j] = new Array25();
        }
        for(int k = 0;k<arr1.length;k++)
        {
            System.out.println(arr1[k].rollno);
            System.out.println(arr1[k].name);
            for(int i=0;i<arr1[k].marks.length;i++)
            {
                System.out.println(arr1[k].marks[i]);
            }
        }
    }
}
class Student
{
    public static void main(String[] args) {
        Array25.display();
    }
}
