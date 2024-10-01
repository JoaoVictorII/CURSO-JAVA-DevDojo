import java.util.Scanner;

public class Aula09 {
    static Scanner leitor = new Scanner(System.in);


    public static void main(String[] args) {
        double salarioAnual;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;



        System.out.print    ("Digite seu salario bruto: ");
        salarioAnual = leitor.nextFloat();

        if (salarioAnual <= 34712){

            System.out.println("O imposto a ser pago e " + salarioAnual * primeiraFaixa);
            
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){

            System.out.println("O imposto a ser pago e " + salarioAnual * segundaFaixa);

        }else{

            System.out.println("O imposto a ser pago e "+ salarioAnual * terceiraFaixa);

        }
        
    }
    
}