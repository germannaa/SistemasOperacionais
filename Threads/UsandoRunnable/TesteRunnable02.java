ackage javaapplication1;


public class TesteRunnable {
    // TesteMeuRunnable.java
    
    public static void main(String[] args) {
        int valor = 50; 
        
        ContadorCrescente cont1 = new ContadorCrescente ("Thread 1", valor);
        ContadorCrescente cont2 = new ContadorCrescente ("Thread 1", valor);
        ContadorCrescente cont3 = new ContadorCrescente ("Thread 1", valor);
        ContadorCrescente cont4 = new ContadorCrescente ("Thread 1", valor);

        Thread tCount1 = new Thread(cont1);
        Thread tCount2 = new Thread(cont1);
        Thread tCount3 = new Thread(cont1);
        Thread tCount4 = new Thread(cont1);

        tCount1.start();
        tCount2.start();
        tCount3.start();
        tCount4.start();
        //assincronas, independentes e nao monitoraveis
    }
}
