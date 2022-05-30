import java.util.Random;
import java.util.Scanner;

public class JokenpoVSmaquina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rdn = new Random();

        int opcao;
        String Jogador1;

        do {
            opcao = menuPrincipal();

            int Adversario = rdn.nextInt(3);

            if (opcao != 0) {
                System.out.print("Jogador, insira sua jogada: ");
                Jogador1 = in.nextLine().toUpperCase();

                /*
                 * Pedra = 0
                 * Papel = 1
                 * Tesoura =2
                 */

                switch (Jogador1) {
                    case "PEDRA":
                        switch (Adversario) {
                            case 0:
                                System.out.println("EMPATE");
                                break;
                            case 1:
                                System.out.println("VOCÊ PERDEU! Seu adversario jogou papel");
                                break;
                            case 2:
                                System.out.println("VOCÊ GANHOU! Seu adversario jogou tesoura");
                                break;
                            default:
                                System.out.println("ERRO");
                        }
                        break;
                    case "PAPEL":
                        switch (Adversario) {
                            case 0:
                                System.out.println("VOCÊ GANHOU! Seu adversario jogou pedra");
                                break;
                            case 1:
                                System.out.println("EMPATE");
                                break;
                            case 2:
                                System.out.println("VOCÊ PERDEU! Seu adversario jogou tesoura");
                                break;
                            default:
                                System.out.println("ERRO");
                        }
                        break;
                    case "TESOURA":
                        switch (Adversario) {
                            case 0:
                                System.out.println("VOCÊ PERDEU! Seu adversario jogou pedra");
                                break;
                            case 1:
                                System.out.println("VOCÊ GANHOU! Seu adversario jogou papel");
                                break;
                            case 2:
                                System.out.println("EMPATE");
                                break;
                            default:
                                System.out.println("ERRO");
                        }
                        break;
                    default:
                        System.out.println("ERRO");
                }
            }
        } while (opcao != 0);
        // ou
        // int opcao=1;
        // while(opcao!=0){
        System.out.println("          Fim de Jogo");
    }

    public static int menuPrincipal() {

        Scanner locaIn = new Scanner(System.in);
        int usrOpcao;

        do {

            System.out.println("-------------------------------------------");
            System.out.println("|        Tela do menu principal           |");
            System.out.println("|  1 - Jogar                              |");
            System.out.println("|  0 - Parar de Jogar                     |");
            System.out.println("-------------------------------------------");
            System.out.print(" Opcao desejado: ");

            usrOpcao = locaIn.nextInt();
            if ((usrOpcao >= 0) && (usrOpcao <= 1)) {
                return usrOpcao;
            } else {
                System.out.println("VOCÊ SELECIONOU UMA OPÇÃO INVALIDA! TENTE NOVAMENTE!");
            }
        } while (true);
    }
}
