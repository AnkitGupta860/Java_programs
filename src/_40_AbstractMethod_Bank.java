abstract class bank{
    abstract int interest();
}
class SBI extends bank
{
    int interest()
    {
        return 7;
    }
}
class PNB extends bank
{
    int interest()
    {
        return 5;
    }
}
public class _40_AbstractMethod_Bank {
    public static void main(String[] args) {
        bank b;
        b = new SBI();
        System.out.println("Interest is of SBI : "+b.interest());
        b = new PNB();
        System.out.println("Interest is of PNB : "+b.interest());
    }
}
