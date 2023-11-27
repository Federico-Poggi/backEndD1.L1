import java.util.Arrays;
import java.util.Scanner;

public class Main2 {



    static void pariDispari (long number1){
        long result=number1 % 2;
        if (result==0){
            System.out.println("Il tuo numero è Pari");
        }else {
            System.out.println("Il tuo numero è Dispari");
        }
    }

    static String[] alContrario(String[] parole){
        String[] nuovoArrayParole;
        String parola2="";
        nuovoArrayParole=new String[3];
        for (int i = 0; i<parole.length; i++){
            String indexValue=parole[i];
            nuovoArrayParole[i]=indexValue;
            System.out.println(Arrays.toString(nuovoArrayParole));
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
            System.out.println(Arrays.toString(arrayParole));
            alContrario(arrayParole);
        }


        {
            long oddEven;
            System.out.println("Inserisci un numero e ti dirò se è pario o dispari");
            oddEven= Integer.parseInt(scanner.nextLine());
            pariDispari(oddEven);

        }
    }
}
