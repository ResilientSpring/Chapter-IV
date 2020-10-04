// Reference: https://www.w3schools.com/java/ref_keyword_this.asp

/*The this keyword refers to the current object in a method or constructor.

The most common use of the this keyword is to eliminate the confusion between class attributes and 
parameters with the same name (because a class attribute is shadowed by a method or constructor parameter). 
If you omit the keyword in the example below, the output would be "0" instead of "5".*/

public class MyClass3 {

	int x;

	// Constructor with a parameter
	public MyClass3(int x) {
		
		this.x = x;
	}

	// Call the constructor
	public static void main(String[] args) {
		
		MyClass3 myObj = new MyClass3(5);
		System.out.println("Value of x = " + myObj.x);
	}

}
