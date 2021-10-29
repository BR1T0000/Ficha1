import java.util.Scanner;

    public class Exercicio1 {
        public static void main(String[] args){
            int a,c;
            float b,d;
            Scanner real = new Scanner(System.in);
            System.out.println("Numero Real ?");
            a = real.nextInt();
            b = a;
            System.out.println(b);

            Scanner inteiro = new Scanner (System.in);
            System.out.println("Numero inteiro ?");
            d = inteiro.nextFloat();
            c =(int)d;
            System.out.println(c);

        }
    }
