import java.lang.reflect.Array;

public class Aula19 {
    public static void main(String[] args) {

        int[][] ArrayInt = new int[3][];
        
        ArrayInt[0] = new int[]{7,8,9};
        ArrayInt[1] = new int[]{1,2,3};
        ArrayInt[2] = new int []{4,5,6};

        for (int i = 0; i < ArrayInt.length; i++) {
            for (int j = 0; j < ArrayInt.length; j++) {
                
                System.out.println("array: " + ArrayInt[i][j]);

            }
        }

    }
}
