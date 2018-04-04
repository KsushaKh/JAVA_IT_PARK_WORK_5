import java.io.Console;
import java.util.Scanner;

public class Preobraz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int b = scanner.nextInt();
        char[] a = new char[b];
        int chislo = 0;
        for (int i = 0; i<b; i++) {
            a[i] = scanner.next().charAt(0);
        }
        chislo = Preobraz.Parse(a);
        System.out.println(chislo + 1);
    }
    public static int Parse(char[] input)
    {
        String str = new String(input);
        int c = Integer.parseInt(str);
        return c;
    }
}

