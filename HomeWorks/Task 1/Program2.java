import java.util.Scanner;
class Program2 {
	public static void main (String args[]) { 
		System.out.println("Введите число от 0 до 255");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		int x1 = x % 2; 
		int x2 = (x / 2) % 2;
		int x3 = (x / 4) % 2;
		int x4 = (x / 8) % 2;
		int x5 = (x / 16) % 2;
		int x6 = (x / 32) % 2;
		int x7 = (x / 64) % 2;
		int x8 = (x / 128) % 2;
		
		
		System.out.print("Двоичная система исчисления " + x8);
		System.out.print("" + x7);
		System.out.print("" + x6);
		System.out.print("" + x5);
		System.out.print("" + x4);
		System.out.print("" + x3);
		System.out.print("" + x2);
		System.out.print("" + x1);
		
		
		
	}
}
