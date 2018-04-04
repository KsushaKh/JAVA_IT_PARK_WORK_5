import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число строк матрицы");
        int m = scanner.nextInt();
        System.out.println("Ввести число столбцов матрицы");
        int n = scanner.nextInt();
        int k = 0;
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
        {
            System.out.println(" ");
            // в if проверяем четность/нечетность строки
            // если строка четная или равна 0 по порядку,
            // то заполняем по возрастанию до n элементов
            // иначе в обратном порядке пока j >= 0
            if (i == 0 || i % 2 == 0)
            {
                for (int j = 0; j < n; j++)
                {
                    a[i][j] = ++k;
                }
            }
            else if (i % 2 != 0)
            {
                for (int j = n - 1; j >= 0; j--)
                {
                    a[i][j] = ++k;
                }
            }
        }

        //Ниже выводим матрицу
        for (int i = 0; i < m; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println(" ");
    }
}

