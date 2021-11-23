class Mythr extends Thread
{
    public Mythr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<200)
        {
            System.out.println("Thank You :"+this.getName());
            i++;
        }
    }
}
public class _45_Thread_priorities {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Ankit 1 (Most Important");
        Mythr t2 = new Mythr("Ankit 2");
        Mythr t3 = new Mythr("Ankit 3");
        Mythr t4 = new Mythr("Ankit 4");
        Mythr t5 = new Mythr("Ankit 5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
