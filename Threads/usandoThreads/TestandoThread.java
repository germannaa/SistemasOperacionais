  // TesteMinhaThread.java
public class TesteMinhaThread {
    
    public static void main(String[] args) {
        ContadorDecrescente mt1 = new ContadorDecrescente(  );
        mt1.setName("t1");
        ContadorDecrescente mt2 = new ContadorDecrescente(  );
        mt2.setName("t2");
        ContadorDecrescente mt3 = new ContadorDecrescente(  );
        mt3.setName("t3");
        ContadorDecrescente mt4 = new ContadorDecrescente(  );
        mt4.setName("t4");
        mt2.start();
        mt1.start();
        mt3.start();
        mt4.start();
    }
}

