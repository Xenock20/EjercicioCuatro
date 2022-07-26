import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        //Condicion if.
        int numeroIf;

        System.out.println("Ingrese un numero: ");
        numeroIf = ingreso.nextInt();

        if(numeroIf > 0){
            System.out.println("El numero es positivo (codicion if)");
        } else if(numeroIf < 0){
            System.out.println("El numero es negativo (codicion if)");
        } else{
            System.out.println("El numero 0 (codicion if)");
        }
        //Fin de la condicion if.

        //Bucle While.
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("El numero es:" + numeroWhile + " (bucle while)");
            numeroWhile++;
        }
        //Fin del bucle while

        //Bucle Do While
        int numeroDoWhile = 3;

        do {
            System.out.println("El numero es:" + numeroWhile + " (bucle do while)");
        }while (numeroWhile < 3);
        //Fin del bucle do while

        //Bucle for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Numero For: " + numeroFor);
        }
        //Fin del bucle for

        //Switch
        var estacion = "";

        System.out.println("Ingrese una estacion:");
        estacion = ingreso.next();

        switch (estacion){
            case "verano":
                System.out.println("Estas en verano");
                break;
            case "otoño":
                System.out.println("Estas en otoño");
                break;
            case "invierno":
                System.out.println("Estas en invierno");
                break;
            case "primavera":
                System.out.println("Estas en primavera");
                break;
            default:
                System.out.println("Valor incorrecto");
        }
        //Fin del Switch
    }
}
