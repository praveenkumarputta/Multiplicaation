
class Calculator { // grandfather

	public int add(int i, int j) {
		return i + j;
	}
}

class CalcAdv extends Calculator { // calcAdv father

	public int sub(int i, int j) {
		return i - j;
	}

}

class CalcMega extends CalcAdv { // calcMega child of calcAdv
	public int mul(int i, int j) {
		return i * j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		CalcMega c1 = new CalcMega();

		int result1 = c1.add(10, 90);
		int result2 = c1.sub(6, 3);
		int result3 = c1.mul(10, 7);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
}
