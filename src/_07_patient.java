import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
//Q2) Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),weight(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
//Create an object of the Patient class and check the results.
public class _07_patient {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String patientName = obj.nextLine();
        double height = obj.nextDouble();
        double weight = obj.nextDouble();
        double Bmi = weight/(height*height);
        System.out.println(Bmi);
    }
}
