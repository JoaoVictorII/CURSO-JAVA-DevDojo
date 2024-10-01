import java.util.Scanner;

public class Aula20 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();

    }

    public static void ex01() {
        /*
         * Criar um vetor denominado A com 10 posições do tipo INT, preencher o vetor
         * recebendo dados via teclado e multiplicar o conteúdo de cada elemento do
         * vetor A por 10 armazenando o resultado desta multiplicação em outro vetor
         */

        int[] arrayA = new int[10];
        int[] arrayB = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Escreva um numero: ");
            arrayA[i] = leitor.nextInt();
        }
        System.out.print("\nSaída de dados do vetor A\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("O indice " + i + " = " + arrayA[i]);
        }

        System.out.print("\nSaída de dados do vetor B\n");

        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i] * 10;
            System.out.println("O indice " + i + " = " + arrayB[i]);
        }
    }

    public static void ex02() {
        /*
         * Escreva um programa para ler um vetor de 15 posições e em seguida
         * imprimir seus elementos.
         */

        int[] numeros = new int[15];
        int pos = 0;

        for (int i = 0; i < 15; i++) {

            System.out.println("Escreva o " + (i + 1) + "° numero: ");
            numeros[i] = leitor.nextInt();

        }

        System.out.println("saida de dados: ");
        for (int i = 0; i < 15; i++) {
            System.out.println("[" + (pos + 1) + "]" + numeros[i]);
            pos++;
        }

    }

    public static void ex03() {
        /*
         * Escreva um programa para ler um vetor de 15 posições e em seguida
         * imprimir seus elementos em ordem invertida.
         */

        int[] numeros = new int[15];
        int pos = 0;

        System.out.println("Digite 15 numeros");
        for (int i = 0; i < 15; i++) {

            System.out.print("Escreva o " + (pos + 1) + " numero: ");
            numeros[i] = leitor.nextInt();
            pos++;

        }
        leitor.close();

        pos = 0;

        System.out.println("Saida de dados me ordem invertida ");

        for (int i = 14; i >= 0; i--) {

            System.out.print("[" + (pos + 1) + "]" + numeros[i] + " - ");
            pos++;

        }

    }

    public static void ex04() {
        /*
         * Escreva um programa que leia um vetor de N posições onde N é menor ou igual a
         * 20 e imprimir seus elementos. O usuário deve informar o número de posições e
         * os elementos.
         */

        int vetor[];
        int tamanho;
        int pos = 0;

        do {
            System.out.print("Escreva o tamanho do vetor (de 1 a 20): ");
            tamanho = leitor.nextInt();

            if (tamanho < 1 || tamanho > 20) {

                System.out.print("Erro!!");

            }

        } while (tamanho < 1 || tamanho > 20);

        vetor = new int[tamanho];

        System.out.println("Digite " + tamanho + " numeros: ");

        for (int i = 0; i < tamanho; i++) {

            System.out.print("Escreva o " + (pos + 1) + "° numero: ");
            vetor[i] = leitor.nextInt();
            pos++;

        }

        pos = 0;
        System.out.println("\n\n");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("[" + (pos + 1) + "]" + vetor[i] + " - ");
            pos++;

        }

    }

    public static void ex05() {
        /*
         * Escreva um programa que leia um vetor de N posições onde N é menor ou igual a
         * 20 e imprimir seus elementos. O usuário deve informar o número de posições e
         * os elementos.
         */

        int vetor[];
        int tamanho;
        int pos = 0;

        do {
            System.out.print("Escreva o tamanho do vetor (de 1 a 20): ");
            tamanho = leitor.nextInt();

            if (tamanho < 1 || tamanho > 20) {

                System.out.print("Erro!!");

            }

        } while (tamanho < 1 || tamanho > 20);

        vetor = new int[tamanho];

        System.out.println("Digite " + tamanho + " numeros (sem numero negativos ) : ");

        for (int i = 0; i < tamanho; i++) {

            do {
                System.out.print("Escreva o " + (pos + 1) + "° numero: ");
                vetor[i] = leitor.nextInt();

                if (vetor[i] < 1) {

                    System.out.println("ERRO!!");
                }

            } while (vetor[i] < 1);
            pos++;

        }

        pos = 0;
        System.out.println("\n\n");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("[" + (pos + 1) + "]" + vetor[i] + " - ");
            pos++;

        }

    }

    public static void ex06() {
        /*
         * Escreva um programa para ler N numeros de alunos (N < 100 || N > 0), 2 notas
         * desses alunos e suas respectivas somas.
         */

        int tamanho;
        int pos = 0;

        do {
            System.out.print("Escreva a quantidade de alunos (de 1 a 100): ");
            tamanho = leitor.nextInt();

            if (tamanho < 1 || tamanho > 100) {

                System.out.print("ERRO!!");

            }

        } while (tamanho < 1 || tamanho > 100);

        int[] nota1 = new int[tamanho],
                nota2 = new int[tamanho],
                soma = new int[tamanho];

        System.out.println("Entre com a nota da 1° avaliacao (de 10 ate 100): ");

        for (int i = 0; i < tamanho; i++) {

            do {

                System.out.print("aluno " + (pos + 1) + "° : ");
                nota1[i] = leitor.nextInt();

                if (nota1[i] > 100 || nota1[i] < 0) {

                    System.out.println("ERRO!!");

                }

            } while (nota1[i] > 100 || nota1[i] < 0);
            pos++;
        }

        pos = 0;

        System.out.println("Entre com a nota da 2° avaliacao (de 10 ate 100): ");

        for (int i = 0; i < tamanho; i++) {

            do {

                System.out.print("aluno " + (pos + 1) + "° : ");
                nota2[i] = leitor.nextInt();

                if (nota2[i] > 100 || nota2[i] < 0) {

                    System.out.println("ERRO!!");

                }

            } while (nota2[i] > 100 || nota2[i] < 0);
            pos++;
        }

        System.out.println("Soma das notas: ");

        for (int i = 0; i < tamanho; i++) {

            soma[i] = nota1[i] + nota2[i];

            System.out.println(soma[i]);

        }

    }

    public static void ex07() {

            /*
     * Escreva um programa para ler um vetor AB de 10 posições com elementos
     * fornecidos pelo usuário. Para cada elemento ímpar encontrado, multiplique ele
     * por dois, gerando assim um vetor de elementos pares e ao final exiba o
     * resultado
     */

    int[] AB = new int[10];
    int pos = 0;

    System.out.println("Escreva os numeros para preencher o vetor de espaço 10");

    for (int i = 0; i < 10; i++) {

        System.out.println("Escreva o " + (pos +1)+ " Numero: ");
        AB[i] = leitor.nextInt();

        if(AB[i] % 2 != 0){
            AB[i] *= 2;
        }

        pos++;

    }

    pos=0;

    for (int i = 0; i < 10; i++) {

        System.out.println("VETOR ["+(pos+1)+"] - "+AB[i]);
        pos++;
    }

    }


    
}
