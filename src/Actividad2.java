import java.util.*;
//Autor: Alma Dimas Sanchez

public class Actividad2{
    //Metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaración de variables
        String nombre;
        char letra='A';
        int[] calificaciones = new int[5];
        double totalpromedio = 0;

            //Se pide al usuario que ingrese su nombre y sus calificaciones
        System.out.println("Ingrese el nombre del estudiante por favor");
        nombre = sc.nextLine();
        System.out.println("Ingrese sus 5 calificaciones en un rango de 0/100");

        for (int i = 0; i < 5; i++) {

            calificaciones[i] = sc.nextInt();
        }
        totalpromedio=promedio(calificaciones);
        letra=convertir(totalpromedio);
        imprimir(nombre, calificaciones, totalpromedio, letra);

    }
        //Primer método donde se hace el promedio
    public static double promedio (int[] califArray){
        double prom=0;
        for (int num : califArray) {
            prom = prom + num;
        }
        prom=(prom/5);
        return prom;
    }

            //segundo promedio donde el promedio se convierte a una letra
    public static char convertir (double Numero){
        char prom='F';
        if (Numero >90) {
            prom = 'A';
        } else if (Numero >= 81) {
            prom = 'B';
        }else if (Numero >= 71) {
            prom = 'C';
        }else if (Numero >= 61) {
        prom = 'D';
        }
        else if (Numero >= 51) {
            prom = 'E';
        }
        return prom;
    }
            //tercer método donde se imprime los resultados
    public static void imprimir (String nombre, int[] Calificaciones, double totalPromedio, char letra){
        System.out.println("Nombre del estudiante " +nombre);
        System.out.println("Calificación 1: " +Calificaciones [0]);
        System.out.println("Calificación 2: " +Calificaciones [1]);
        System.out.println("Calificación 3: " +Calificaciones [2]);
        System.out.println("Calificación 4: " +Calificaciones [3]);
        System.out.println("Calificación 5: " +Calificaciones [4]);

        System.out.println("Promedio: " +totalPromedio );
        System.out.println("Calificación: " +letra );

    }
}
