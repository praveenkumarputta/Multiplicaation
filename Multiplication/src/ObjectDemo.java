
class Calc { // Create class
	int num1;
	int num2; // Variables creation
	int result;

	public void perform() {

		result = num1 + num2; // method creation
								// this method name is "perform(){}"
	}// Calc
}// method

public class ObjectDemo {

	public static void main(String[] args) { // main method

		Calc obj = new Calc(); // object creation
								// calc()method name// obj "reference variable"

		obj.num1 = 8; // assign the values
		obj.num2 = 10;

		obj.perform();  // call the method

		System.out.println(obj.result);//18

	}// main

}// objdemo



