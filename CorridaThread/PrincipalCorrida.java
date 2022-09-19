
package newpackage;


public class Principal {
        public static void main(String[] args) {
            int trajeto = 10;
            
            new Corrida("Corredor1", trajeto, 1).start();
            new Corrida("Corredor2", trajeto, 2).start();
            new Corrida("Corredor3", trajeto, 3).start();
            new Corrida("Corredor4", trajeto, 4).start();
          
            
}}
