
    // ContadorCrescente.java
public class ContadorCrescente implements java.lang.Runnable {

    // área de dados da Thread
    private int contador; 
   // private int limite;
    
    // inicializador da MinhaThread 
    public ContadorCrescente () {
       // this.limite = limite; 
        this.contador = 0;
    }

    // área de código da Thread
    public void run() {
        for (int contador = 0; contador<=100; contador++ ){
            System.out.println( Thread.currentThread().getName() + "\t" + contador );
            contador+=1;
        }
     
    }
}

