//Q4) Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
//
//Example1)
//If the two command line arguments are GLA and Mathura then the output generated should be GLA University Mathura.
//
//Example2)
//If the command line arguments are AAA and Delhi then the output generated should be AAA Technologies Delhi
//
//[Note: It is mandatory to pass two arguments in command line]
public class _09_Question_4 {
    public String str1;
    public String str2;

}
class Question4
{
    public static void main(String[] args) {
        _09_Question_4 obj = new _09_Question_4();
        obj.str1 = args[0];
        obj.str2 = args[1];
        if( obj.str1 == "GLA" && obj.str2 == "Mathura"){
            System.out.println("GLA University Mathura");
        }
        else if (obj.str1 == "AAA" && obj.str2 == "Delhi"){
            System.out.println("AAA Technologies");
        }
    }
}
