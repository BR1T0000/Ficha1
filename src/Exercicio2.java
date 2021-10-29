import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        double a, b;
        Scanner dolar = new Scanner(System.in);
        System.out.println("Quantia em doláres $?");
        a = dolar.nextDouble();
        a = a * 0.86;
        System.out.printf("Quantia em Euros %.2f €",a);
    }
}
