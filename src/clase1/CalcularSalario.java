package clase1;

import java.util.Scanner;

public class CalcularSalario {


    public static void main(String arg[]){

        // 1. El primer paso es que obtendríamos la cantidad de horas trabajadas.
        System.out.println("Ingresar la cantidad de horas trabajadas");
        Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();

        /*2. Luego, obtenemos la tarifa de pago por hora.*/
        System.out.println("Ingresar la tarifa de pago por hora");
        double tarifa = scanner.nextDouble();

        //3. Luego, multiplicamos las horas y la tasa de pago.
        double salario = horas * tarifa;

        //4. Finalmente, mostraríamos el resultado.
        System.out.println("El salario calculado es: "+salario);
    }









}
