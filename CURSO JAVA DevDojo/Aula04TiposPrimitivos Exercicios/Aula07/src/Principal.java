import java.util.Scanner;

public class Principal {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        ex04();
        
    }

    public static void ex01(){

        double raio;
        double areaCirc;

        System.out.println("Insira o raio do circulo: ");
        raio = leitor.nextDouble();

        areaCirc = (3.14 * (raio * raio));

        System.out.println("A area do circulo é igual :" + areaCirc);

    }
    
    public static void ex02(){
        
        double celsius;
        double fahrenheit;

        System.out.println("Informe os graus em celcius: ");
        celsius = leitor.nextDouble();

        fahrenheit = (celsius * 1.8 + 32);

        System.out.println("A temperatura em Fahrenheit é igual a: " + fahrenheit);

    }

    public static void ex03(){

        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("insira suas notas: ");
        nota1 = leitor.nextDouble();
        nota2 = leitor.nextDouble();
        nota3 = leitor.nextDouble();

        media = ((nota1 + nota2 + nota3) /3);

        System.out.println("Sua média e: " + media);

    }

    public static void ex04(){

        int num;

        System.out.println("Insira um valor: ");
        num = leitor.nextInt();

        if(num % 2 == 0){

            System.out.println("O numero e par!!");

        }else if(num % 2 !=0){

            System.out.println("O numero nao e par!!");

        }else{

            System.out.println("I N V A L I D O !!!");

        }

    }
}
