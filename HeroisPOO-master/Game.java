import java.util.Scanner;

public class Game extends Main {
    void EscolherPersonagem(){
        Mago mago = new Mago();
        Guerreiro guerreiro = new Guerreiro();
        Arqueiro arqueiro = new Arqueiro();
        Scanner s = new Scanner(System.in);
        boolean state = true;
        while(state){
            System.out.println("1- Mago, 2- Guerreiro, 3- Arqueiro\n");
            int e = s.nextInt();
            switch (e) {
                case 1 : {
                    System.out.println("Mago");
                    mago.statusMago();
                    break;
                    
                }
                case 2 : {
                    System.out.println("Guerreiro");
                    guerreiro.guerreiroStatus();
                    break;
                }
                case 3 : {
                    System.out.println("Arqueiro");
                    arqueiro.arqueiroStatus();
                    break;
                }

                case 4 : {
                    //inserir escolha de menu
                }
                default: {System.out.println("Não entendi a resposta");}
            }
        }
    }


    void Atacar(){
        Arqueiro arco = new Arqueiro();
        //inserir a ação de ataque do arqueiro
    }
}
