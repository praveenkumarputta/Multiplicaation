
class Emotion {

	public String Sorry() {
		return "Sorry Hareesh anna";
	}// sorry()
}// blc

//here sorry() is called method name
//here public is accessmodfier
//here String is return type values here itself

//execution logic class is ItsOk

//because we  need to test sorry() method is working or not that's why we want
// Execution logic

public class ItsOk {
	public static void main(String[] args) {

//execution start from main method		
		Emotion emotion = new Emotion();

		// object creation
		// why we are creation object, because to read all properties from
		// any other classes we want to create object
		// after creating a object, with the help of reference variable we can
		// call the properties or methods from their class

		// here Emotion is the blc, emotion is reference variable
		// new is keyword from java
		// Emotion() is the default constructor or object creating
		// String is return type, then x is itsOk class reference
		// emotion is the reference variable is blc
		// Sorry() here calling Sorry() method to test , whether is's working or not

		String x = emotion.Sorry(); // methodcall
		System.out.println(x);

	}// main
}// execution class
