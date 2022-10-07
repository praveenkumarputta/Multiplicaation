
public class ArryDemo {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 2, 4, 6, 8, 10 };
		int c[] = { 5, 6, 7, 8, 9 };

		int d[][] = {
				// a,b,c
				// { 1, 2, 3, 4, 5 }, { 2, 4, 6, 8, 10 }, { 5, 6, 7, 8, 9 } };

				{ 1, 2, 3, 4 }, { 2, 4, 6, }, { 5, 6, 7, 8 }
				};

		// System.out.print(d[2][2]);

//		for (int i = 0; i <= 3; i++) { // rows
//
//			for (int j = 0; j <= 4; j++) { // column

		for (int i = 0; i < d.length; i++) { // rows

			for (int j = 0; j < d[i].length; j++) { // column

				System.out.print(" " + d[i][j]);
			}
			System.out.println( );
		}
	}

}
