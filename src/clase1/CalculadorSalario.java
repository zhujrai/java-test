package clase1;

import java.util.Scanner;

/**
 * Declaración IF
 *
 * Todos los vendedores reciben un pago de $ 1000 por semana.
 * Los vendedores que superen las 10 ventas obtienen un bono adicional de $ 250.
 */
public class CalculadorSalario {

    public static void main(String args[]){
        //Inicializar las variables
        int salario = 1000;
        int bono = 250;
        int ventas = 10;

        //obtener el numero de ventas
        System.out.println("¿Cuantas ventas ha realizado el empleado, esta semana?");
        Scanner scanner = new Scanner(System.in);
        int ventasRealizadas = scanner.nextInt();
        scanner.close();

        //Calcular el bono
        if(ventasRealizadas > ventas){
            salario = salario + bono;
        }

        //Imprimir el resultado
        System.out.println("El salario calculado es: "+salario);

    }

}
