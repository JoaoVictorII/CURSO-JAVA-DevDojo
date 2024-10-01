import java.util.Scanner;

public class Aula10 {
        static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        
        byte dia;

        System.out.print("Escreva um dia da semana (Domingo = 1): ");
        dia = leitor.nextByte();

        switch (dia) {
            case 1 :
            System.out.println("seu dia da semana é domingo");
            break;

            case 2 :
            System.out.println("seu dia da semana é segunda");
            break;
                    
            case 3 :
            System.out.println("seu dia da semana é terça");
            break;
                        
            case 4 :
            System.out.println("seu dia da semana é quarta");
            break;

            case 5 :
            System.out.println("seu dia da semana é quinta");
            break;

            case 6 :
            System.out.println("seu dia da semana é sexta");
            break;

            case 7 :
            System.out.println("seu dia da semana é sabado");
            break;

            default:
                break;
        }

        char sexo;

        System.out.println("Escreva teu genero (M ou F): ");
        sexo = leitor.next().charAt(0);

        switch (sexo ){

            case 'm':
            System.out.println("Masculino");
            break;

            case 'f':
            System.out.println("Feminino");
            break;

            default:
            System.out.println("Invalido");
            break;
    
        }


    }
    
}