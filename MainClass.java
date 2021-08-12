import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		Scanner _key = new Scanner(System.in);
		double a;
		boolean teste;
		double b;
		double c;
		double d;
		double e;
		teste = true;
		a = 10;
		b = 0;
		c = 0;
		if (a > 10) {
			System.out.println(true);
			System.out.println(5);
			System.out.println("6");
		}
		if (a > b + 15) {
			if (b > 5) {
				System.out.println(b);
			} else {
				System.out.println(b);
			}
			System.out.println(a);
		} else {
			System.out.println(teste);
		}

		if (a > 10) {
			System.out.println(c);
		}
		while (b < a + 3) {
			System.out.println(b);
			b = b + 1;
			d = a * b;
			while (c < d - 2) {
				System.out.println(c);
				c = c + b;
			}
		}
		while (!teste) {
			System.out.println(teste);
		}
		for (e = 0; e < a + 2; e = e + 2) {
			System.out.println(e);
			for (c = 0; c < e + 3; c = c + 1) {
				System.out.println(c);
			}
		}
	}
}