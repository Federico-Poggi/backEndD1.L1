import java.util.Scanner;
public class Main {
    static long multi ( long number1, long number2){
        return number1 * number2;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {
            long number1;
            long number2;
            long sumNumbers;
            System.out.println("Inserisci il primo numero intero (senza virgola):");
            number1=Integer.parseInt(scanner.nextLine());
            System.out.println("Ora inserisci il secondo numero intero (senza Virgola):");
            number2=Integer.parseInt(scanner.nextLine());
            System.out.println("La Moltiplicazione tra" + " " + number1 + " " + "e" + " " + number2 + " " + "è:" + " " + multi(number1,number2));
        }


    }
}





