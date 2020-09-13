import java.util.Random;

public class headORtail {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int random = rand.nextInt(2);
		
		if (random == 1) {
			System.out.print("Hoorayyyy! You are win!");
		} else {
			System.out.print("Boooo! You are lose!");
		}
	}

}
