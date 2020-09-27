import java.util.Scanner;

public class DivisionBy5Or7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = input.nextInt();
		
		int i = 0;
		while (i <= n) {
			if (i % 5 == 0)
				System.out.print(i + " ");
			else if (i % 7 == 0)
				System.out.print(i + " ");
			i++;
		}
		System.out.println("");
		System.out.print("End of number.");

	}

}
