package clase1;

import java.util.Scanner;

public class ClasificaNota {

    public static void main(String arg[]){
        int nota = 0;
        String clasific = "X";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valor de la nota");
        nota = scanner.nextInt();

        if (nota < 11) {clasific = "F";}
        else if(nota < 12) {clasific = "E";}
        else if (nota < 14) {clasific = "C";}
        else if (nota < 18) {clasific = "A";}
        else if (nota <= 20) {clasific = "A+";}
        else  System.out.println("error");

        System.out.println("Su clasificación es "+clasific);
    }

}
