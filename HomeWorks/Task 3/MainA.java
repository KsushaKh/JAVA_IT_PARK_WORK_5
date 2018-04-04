import java.util.Random;
import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число строк матрицы");
        int m = scanner.nextInt();
        System.out.println("Ввести число столбцов матрицы");
        int n = scanner.nextInt();
        int z;
        Random random = new Random();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < n; j++)
            {
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println("Изначальный вариант матрицы");

        for (int k = 0; k < m; k++)
        {
            for (int l = 0; l < n; l++)
            {
                z = 0;
                for (int i = k; i < m; i++)
                {
                    for (int j = (i==k)? l + 1 : 0; j < n; j++)
                    {
                        if (a[k][l] == a[i][j])
                        {
                            a[i][j] = 0;
                            z = 1;
                        }
                    }
                }
                if (z == 1)
                    a[k][l] = 0;
            }
        }
        for (int k = 0; k < m; k++)
            {
                for (int l = 0; l < n; l++)
                {
                    z = 0;
                    for (int i = k; i < m; i++)
                    {
                        for (int j = (i==k)? l + 1 : 0; j < n; j++)
                        {

                            if (a[k][l] == a[i][j])
                            {
                                a[i][j] = 0;
                                z = 1;
                            }


                        }

                    }
                    if (z == 1)
                        a[k][l] = 0;
                }
            }

            for (int i = 0; i < m; i++)
            {
                System.out.println(" ");
                for (int j = 0; j < n; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
            }

        }
    }

