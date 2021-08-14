import java.util.Scanner;
public class MainClass {
	public static void main(String args[]) {
		Scanner _key = new Scanner(System.in);
		double a;
		double b;
		double c;
		a = 15;
		b = 3;
		c = 0;
		do {
			System.out.println(b);
			b = b + 2;
			do {
				c = c + 1;
			} while (c < b);
		} while (true);
	}
}