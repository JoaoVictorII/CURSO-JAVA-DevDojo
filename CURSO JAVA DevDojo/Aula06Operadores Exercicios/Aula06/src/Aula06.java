import java.util.Scanner;

public class Aula06 {
    static Scanner leitor = new Scanner(System.in);


    public static void main(String[] args) {
        ex02();
    }

    public static void ex01(){

    int num1;
    int num2;
    float div;


    System.out.println("Escreva 2 numeros: ");
    num1 = leitor.nextInt();
    num2 = leitor.nextInt();

    div = (num2 == 0) ? num1 : num1 / num2;

    System.out.println("Soma: " + (num1 + num2));
    System.out.println("Subtracao : " + (num1 - num2));
    System.out.println("Multiplicacao: "+(num1 * num2));
    System.out.println("Divisao: "+ div);
    
    }

    public static void ex02(){

        int num1;
        int num2;
        int num3;


        System.out.println("Digite 3 numeros: ");
        num1 = leitor.nextInt();
        num2 = leitor.nextInt();
        num3 = leitor.nextInt();

        int maior = num1;

    if(num2 > maior){
        maior = num2;
    }
    if(num3 > maior){
        maior = num3;
    }

        int menor = num1;

    if(num2 < menor){
        menor = num2;
    }
    if(num3 < menor){
        menor = num2;
    }

    System.out.println(maior +" e o maior numero");
    System.out.println(menor + " e o menor numero");    

  }
}