
public class Lottozahlen {

	public static void main(String[] args) {

		boolean[] lottozahlen = new boolean[49];
		int ziehung = 0;

		for (int i = 0; i < 7; i++) {
			do {
				ziehung = (int) (Math.random() * 48) + 1;
			} while (lottozahlen[ziehung]);
			lottozahlen[ziehung] = true;
		}

		for (int i = 0; i < lottozahlen.length; i++) {
			if (lottozahlen[i]) {

				System.out.println(i);
			}

		}
	}
}
