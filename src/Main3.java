import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    static String[] alContrario(String[] parole){
        String[] nuovoArrayParole;
        String parola2="";
        nuovoArrayParole=new String[3];
        for (int i = 0; i<parole.length; i++){
            String indexValue=parole[i];
            nuovoArrayParole[i]=indexValue;

        }
        return nuovoArrayParole;
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        {
            String[] arrayParole;
            arrayParole=new String[3];
            System.out.println("Inserisci tre parole");
            for(int i = 0; i<arrayParole.length; i++){
                String parola;
                parola= scanner.nextLine();
                arrayParole[i]=parola;
            }
            System.out.println( " Array di Parole:" + " " + Arrays.toString(arrayParole));
           System.out.println(Arrays.toString(alContrario(arrayParole)));
        }

    }
}
