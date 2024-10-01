public class Aula11 {

    public static void main(String[] args) {
        While();
    //    DoWhile();
    //    For();

    }
    

    public static void While() {
        
        int contador = 0;

        while(contador <= 10){
            System.out.println(contador);
            contador ++;
        }
    }

    public static void DoWhile(){

        int contador = 0;

                  do{
            System.out.println(contador);
        }while(contador <=10);  
    }

    public static void For(){

        int contador = 0;

        for(contador = 0;contador <= 10;contador++){
            System.out.println(contador);
        }
    }


}