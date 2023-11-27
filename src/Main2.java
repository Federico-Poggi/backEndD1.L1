import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    static String[] alContrario(String[] parole){
        String[] nuovoArrayParole;
        nuovoArrayParole=new String[parole.length];


//uso indici per invertire l'ordine e ottener un array invertito;

        for (int i = parole.length-1; i >= 0; i--) {
            nuovoArrayParole[parole.length-1 - i]=parole[i];
        }
        return nuovoArrayParole;
    };
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