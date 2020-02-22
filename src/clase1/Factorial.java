package clase1;
import java.util.Scanner;

public class Factorial {
    public static void main(String Arg[]){
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número");
        int numero = sc.nextInt();
        sc.close();
        for (int i = 1;i<=numero;++i){
            factorial = factorial*i;
        }
        System.out.println("El Factorial de "+numero+" es "+factorial);
    }

}
