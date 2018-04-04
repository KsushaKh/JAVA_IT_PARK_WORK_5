import java.util.Random;
import java.util.Scanner;

public class MainD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число строк матрицы");
        int m = scanner.nextInt();
        System.out.println("Ввести число столбцов матрицы");
        int n = scanner.nextInt();
        Random random = new Random();
        int[][] a = new int[m][n];
        int sum = 0;
        System.out.println("Изначальный вид матрицы");
        for (int i = 0; i < m; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < n; j++)
            {
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println(" ");

        int k = n - 1;
        while (k >= 0)
        {
            for (int i = 0; i < m; i++)
            {
                sum = a[i][k] + sum;
                k--;
            }
        }
        System.out.println("Сумма элементов побочной диагонали матрицы = " + sum);
    }
}
