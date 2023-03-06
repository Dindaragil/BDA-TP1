import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka bulat positif: ");
        int bilangan = input.nextInt();

        if (bilangan <= 1) {
            System.out.println("Angka " + bilangan + " bukan bilangan prima karena bukan bilangan bulat positif yang lebih besar dari 1.");
        } else {
            boolean isPrima = true;
            for (int i = 2; i <= Math.sqrt(bilangan); i++) {
                if (bilangan % i == 0) {
                    isPrima = false;
                    System.out.println("Angka " + bilangan + " bukan bilangan prima karena dapat dibagi dengan " + i + ".");
                    break;
                }
            }
            if (isPrima) {
                System.out.println("Angka " + bilangan + " adalah bilangan prima.");
            }
        }
    }
}
