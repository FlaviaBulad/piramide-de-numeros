import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       input.close();

        System.out.println("Piramide de numeros do 1 ao " + number + "\n");
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}