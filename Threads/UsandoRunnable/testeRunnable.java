
public class testeMeuRunnable {
    // TesteMeuRunnable.java
    
    public static void main(String[] args) {
        ContadorCrescente mr1 = new ContadorCrescente ();
        ContadorCrescente mr2 = new ContadorCrescente ();
        ContadorCrescente mr3 = new ContadorCrescente ();
        ContadorCrescente mr4 = new ContadorCrescente ();
        Thread t1 = new Thread( mr1 );
        t1.setName("T1");
        Thread t2 = new Thread( mr2 );
        t2.setName("T2");
        Thread t3 = new Thread( mr3 );
        t3.setName("T3");
        Thread t4 = new Thread( mr4 );
        t4.setName("T4");
        t2.start();
        t1.start();
        t3.start();
        t4.start();
    }
}
