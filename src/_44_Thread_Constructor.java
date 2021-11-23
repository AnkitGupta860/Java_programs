class MYthr extends Thread
{
    public MYthr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i = 34;
        System.out.println("I am a thread");
    }
}
public class _44_Thread_Constructor {
    public static void main(String[] args) {
    MYthr t1 = new MYthr("Ankit");
    MYthr t2 = new MYthr("Gupta");
    System.out.println("My id is "+t1.getId());
    System.out.println("My name is "+t1.getName());
    System.out.println("My id is "+t2.getId());
    System.out.println("My name is "+t2.getName());
    }
}
