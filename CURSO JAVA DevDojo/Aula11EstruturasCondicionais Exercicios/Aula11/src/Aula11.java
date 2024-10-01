import java.util.Scanner;

public class Aula11 {
            static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        
        byte dia;
        String mensagem = "E é final de semana"; 



        System.out.println("Que dia é hoje? ");
        dia = leitor.nextByte();

    
        

        switch (dia) {
            case 1:

                System.out.println("Hoje é Domingo!");
                System.out.println(mensagem);
                
                break;

            case 2:

                System.out.println("Hoje é Segunda!");
                
                break;

            case 3:

                System.out.println("Hoje é Terca!");
                
                break;
            case 4:

                System.out.println("Hoje é Quarta!");
                
                break;
            case 5:

                System.out.println("Hoje é Quinta!");
                
                break;
            case 6:

                System.out.println("Hoje é Sexta!");
                
                break;
            case 7:

                System.out.println("Hoje é Sabado!");
                System.out.println(mensagem);
                
                break;


        
            default:
                break;
        }

        

    }
    
}