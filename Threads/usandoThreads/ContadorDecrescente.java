

public class ContadorDecrescente extends java.lang.Thread {

    // área de dados da Thread
    private int contador; 
    //private int limite;
    
    // inicializador da MinhaThread 
    public ContadorDecrescente( ) {
       // this.limite = limite; 
        this.contador = 1000;
    }

    // área de código da Thread
    public void run() {
        for (int contador = 100; contador >= 0; contador--) {
            System.out.println( super.getName() + "\t" + contador );
            
           
        }
    }
}

