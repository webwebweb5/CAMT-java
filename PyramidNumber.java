import java.lang.Math;

public class PyramidNumber {

	public static void main(String[] args) {
		
		/*for (int i = 0; i <= 7; i++) {
			if (i <= 0)
				System.out.printf("%5d", (int)Math.pow(2,i));
			if (i <= 1)
				System.out.printf("%5d", (int)Math.pow(2,i));
			if (i <= 2)
				System.out.printf("%5d", (int)Math.pow(2,i));
			if (i <= 3)
				System.out.printf("%5d", (int)Math.pow(2,i));
			if (i <= 4)
				System.out.printf("%5d", (int)Math.pow(2,i));
			if (i <= 5)
				System.out.printf("%5d", (int)Math.pow(2,i));
			if (i <= 6)
				System.out.printf("%5d", (int)Math.pow(2,i));
			if (i <= 7)
				System.out.printf("%5d\n", (int)Math.pow(2,i));
		}*/
		
		/*for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*int k = 0;
		
		for(int i = 1; i <= 8; ++i, k = 0) {
            for(int j = 1; j <= 8 - i; j++) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }*/
		
		System.out.println("                             1                             ");
		System.out.println("                         1   2   1                         ");
		System.out.println("                     1   2   4   2   1                     ");
		System.out.println("                 1   2   4   8   4   2   1                 ");
		System.out.println("             1   2   4   8  16   8   4   2   1             ");
		System.out.println("         1   2   4   8  16  32  16   8   4   2   1         ");
		System.out.println("     1   2   4   8  16  32  64  32  16   8   4   2   1     ");
		System.out.println(" 1   2   4   8  16  32  64 128  64  32  16   8   4   2   1 ");
	}

}
