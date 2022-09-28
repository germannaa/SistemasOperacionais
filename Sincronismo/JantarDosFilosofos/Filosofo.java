package SistemasOperacionais.Sincronismo;

public class Filosofo extends Thread {
   final static int TEMPO_MAXIMO = 100;
   Mesa mesa;
   int filosofo;

   public Filosofo (String nome, Mesa mesadejantar, int filosofo)
   {
      super(nome);
      this.mesa = mesadejantar;
      this.filosofo = filosofo;
   }

   public void run ()
   {
      int tempo = 0;
      while (true)
      {
         tempo = (int) (Math.random() * TEMPO_MAXIMO);
         pensar(tempo);
         getGarfos();
         tempo = (int) (Math.random() * TEMPO_MAXIMO);
         comer(tempo);
         returnGarfos();
      }
   }

   public void pensar (int tempo)
   {
      try
      {
         sleep(tempo);
      }
      catch (InterruptedException e)
      {
         System.out.println("O Filófoso pensou em demasia");
      }
   }

   public void comer (int tempo)
   {
      try
      {
         sleep(tempo);
      }
      catch (InterruptedException e)
      {
         System.out.println("O Filósofo comeu em demasia");
      }   
   }

}
