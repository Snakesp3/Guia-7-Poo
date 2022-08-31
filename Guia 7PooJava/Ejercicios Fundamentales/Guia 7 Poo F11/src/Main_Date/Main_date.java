package Main_Date;

import java.util.Date;
import java.util.Scanner;

public class Main_date {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Date fecha = new Date();
        Date fechaActual = new Date();

        System.out.println("ingrese el dia");
        fecha.setDate(leer.nextInt());
        System.out.println("ingrese el mes");
        fecha.setMonth(leer.nextInt());
        System.out.println("ingrese el año");
        fecha.setYear(leer.nextInt());

        System.out.println("la fecha es " + fecha.getDate() + " " + fecha.getMonth() + " " + fecha.getYear());
        System.out.println("hay " + (fechaActual.getYear() + 1900 - fecha.getYear()) + " años de diferencia");
    }

}
    

