package m02.s10.ex;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO: print all values in [0 .. 9]

		// (1) for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("----");
		
		
		// (2) while loop
		int i= 0;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		
		System.out.println("----");

		// (3) do-while loop
		int j= 0;
		do {
			System.out.println(j);
			j++;
		} while (j<10);
	}

}