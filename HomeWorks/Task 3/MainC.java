import java.util.Random;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число строк матрицы");
        int m = scanner.nextInt();
        System.out.println("Ввести число столбцов матрицы");
        int n = scanner.nextInt();
        Random random = new Random();
        int[][] a = new int[m][n];
        int min;
        int str = 0;

        for (int i = 0; i < m; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println(" ");


        for (int i = 0; i < m; i++) {
            int j = 0;
            min = a[i][j];
            for (; j < n; j++) {
                if (a[i][j] <min)
                min = a[i][j];
            }
            str++;
            System.out.println("Минимальное число в строке " + str + " число " + min);
        }
    }
}
