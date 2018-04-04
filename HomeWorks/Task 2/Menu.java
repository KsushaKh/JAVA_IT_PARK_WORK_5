import java.util.Scanner;
class Menu {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("MENU:");
			System.out.println("1. Your range of numbers");
			System.out.println("2. Sum of numbers");
			System.out.println("3. Sum digits of number ");
			System.out.println("4. Exit");
		
		int x = scanner.nextInt();
		
		switch (x) {
				case 1: {
					System.out.println("Введите 2 целых числа");
					int n = scanner.nextInt();
					int k = scanner.nextInt();
					
					if (n <= k)
					{
						while (n <= k)
						{
							if (n % 2 == 0 && n!= 0)
							{
								System.out.print(n + " ");
							}
							n++;
						}
					}
					else
					{
						while (n>k)
						{
							if (n%2 == 0 && n != 0)
							{
								System.out.print(n + " ");
							}
							n--;
						}
					}
					break;
				}
				case 2: {
					System.out.println("Введите количество складываемых чисел");	
					int a = scanner.nextInt();
					int sum = 0;
					for (int i = 0; i < a; i++)
					{
						int b = scanner.nextInt();
						sum = sum + b;
					}
					System.out.println(sum);
					break;
				}
				case 3:{
					System.out.println("Введите число");
					int a = scanner.nextInt();
					String c = String.valueOf(a);
					int b = c.length();
					int sum = 0;
					for (int i = 0; i < c.length(); i++)
					{
						b--;
						sum = a / (int)Math.pow(10, b) + sum;
						a = a - (a / (int)Math.pow(10, b) * (int)Math.pow(10, b));
						
					}
					System.out.println(sum);
					break;
				}					
				default: {
					System.exit(0);
					break;
				}					
					
				}
			}
		}
	}				
					
					
					
					
					
					
					
					
					
					
					
		