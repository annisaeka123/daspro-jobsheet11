/**
 * NestedLoop_2341720131
 */
import java.util.Scanner;
 public class NestedLoop_2341720131 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i=0; i<temps.length; i++) {
            System.out.println("Kota ke-" + (i+1) + ": ");
            double jml = 0.0;
            for (int j=0; j<temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                jml += temps[i][j];
            }
            double rata2 = jml / temps[i].length;
            System.out.println("Rata-rata: " + rata2);
        }
    }
}