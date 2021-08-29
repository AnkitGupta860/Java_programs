import java.util.Scanner;
public class _02_CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your physics marks");
        int phy = sc.nextInt();
        System.out.println("Enter your maths marks");
        int math = sc.nextInt();
        System.out.println("Enter your computer marks");
        int com = sc.nextInt();
        System.out.println("Enter your english marks");
        int eng = sc.nextInt();
        double cgpa = ((phy+math+com+eng)/400.0f)*100;
        System.out.println(cgpa);
    }
}
