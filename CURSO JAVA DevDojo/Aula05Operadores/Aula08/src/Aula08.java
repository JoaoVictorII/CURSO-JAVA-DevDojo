public class Aula08 {

    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2  = 20;
        double resultado = num1 / (double) num2;

        System.out.println(resultado);

        // % resto
        int resto = 21 % 7;
        System.out.println(resto);


        //<> <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualQueVinte = 10==20;
        boolean isDezIgualDez= 10==10;
        boolean isDezDiferenteDeDez= 10!=10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDeDez);

        // && (or) || (and) ! (not)
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >=4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >=3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double ValorTotalCC = 200;
        double ValorTotalCP = 10000;
        float ValorPS5 = 5000f;
        boolean isPS5Compravel = ValorTotalCC > ValorPS5 || ValorTotalCP > ValorPS5;
        System.out.println("\n");
        System.out.println(isPS5Compravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);
    }
    
}
