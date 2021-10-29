import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner n11 = new Scanner(System.in);
        System.out.println("Qual é o primeiro numero ?");
        n1 = n11.nextInt();

        Scanner n22 = new Scanner(System.in);
        System.out.println("Qual é o segundo numero ?");
        n2 = n22.nextInt();

        Scanner n33 = new Scanner(System.in);
        System.out.println("Qual é o terceiro numero ?");
        n3 = n33.nextInt();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1);
        }

        else

            if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n1);
        }

        else
            if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n2);
        }

        else
            if (n2 > n1 && n2 > n3 && n3 > n1) {
            System.out.println(n2);
        }

        else
            if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.println(n3);
        }

        else
            if (n3 > n1 && n3 > n2 && n2 > n1) {
            System.out.println(n3);
        }
    }
}
