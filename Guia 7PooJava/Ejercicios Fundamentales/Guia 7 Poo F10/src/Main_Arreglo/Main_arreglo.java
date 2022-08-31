package Main_Arreglo;

import java.util.Arrays;

public class Main_arreglo {

    public static void main(String[] args) {
        double[] VectorA = new double[50];
        double[] VectorB = new double[20];

        for (int i = 0; i < 50; i++) {

            VectorA[i] = Math.random() * 100;
        }
        System.out.println("VectorA: " + Arrays.toString(VectorA));

        Arrays.sort(VectorA);

        for (int i = 0; i < 10; i++) {

            VectorB[i] = VectorA[i];
        }
        for (int i = 10; i < 20; i++) {

            VectorB[i] = 0.5;
        }
        System.out.println("VectorA: " + Arrays.toString(VectorA));
        System.out.println("VectorB: " + Arrays.toString(VectorB));
    }
}
    

