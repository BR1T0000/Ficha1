import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        double K, C, F;
        Scanner CC = new Scanner(System.in);
        System.out.println("Quantos graus Celsius ?");
        C = CC.nextDouble();
        K = C + 273.15;
        F = C * 1.8000 + 32.00;
        System.out.printf("%.2f graus Celsius são %.2f Kelvin\n", C, K);
        System.out.printf("%.2f graus Celsius são %.2f Fahrenheit\n", C, F);

        Scanner KK = new Scanner(System.in);
        System.out.println("Quantos graus Kelvin ?");
        K = KK.nextDouble();
        C = K - 273.15;
        F = (K - 273.15) * 1.8000 + 32.00;
        System.out.printf("%.2f graus Kelvin são %.2f Celsius\n", K, C);
        System.out.printf("%.2f graus Kelvin são %.2f Fahrenheit\n", K, F);

        Scanner FF = new Scanner(System.in);
        System.out.println("Quantos graus fahrenheit ?");
        F = FF.nextDouble();
        K = F - 32 / 1.8000 + 273.15;
        C = F - 32 / 1.8000;
        System.out.printf("%.2f graus Fahrenheit são %.2f Kelvin\n", F, K);
        System.out.printf("%.2f graus Fahrenheit são %.2f Celsius\n", F, C);


    }
}
