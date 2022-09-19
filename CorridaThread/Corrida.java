
package newpackage;


public class Corrida extends Thread{
    String nome;
    int trajeto;
    int descanso;
    
    public Corrida(String nome, int trajeto, int descanso){
        this.nome = nome;
        this.trajeto=trajeto;
        this.descanso=descanso;
    }

@Override
public void run(){
    for(int i = trajeto; i > 0; i--){
        System.out.println(String.format("Faltam %d para o %s\n", i, nome));
        
    try {
        System.out.printf("%s está descansando", nome);
        sleep(descanso*1000);
    } catch (InterruptedException e){
            e.printStackTrace();
    }
}
    
    System.out.printf("%s ----- Chegou!!", nome);
}
}
