
package javaapplication1;


public class ContadorCrescente implements java.lang.Runnable {

    // área de dados da Thread
     int valor;
     String nome;
    
    // inicializador da MinhaThread 
    public ContadorCrescente(String nome, int valor) {
        this.valor = valor;
        this.nome = nome;
    }

    // área de código da Thread
    @Override
    public void run() {
        for (int i = 0; i<=valor; i++ ){
            System.out.println( nome + ": " + i );
        }
     
    }
}
