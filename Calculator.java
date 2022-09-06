//parent class of MagicCalculator, has 5 basic functions
public class Calculator {
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public static int subtract(int num1, int num2) {
		return num1-num2;
	}
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
	public static double divide(int num1, int num2) {
		return (double)num1/(double)num2;
	}
	public static int square(int num1) {
		return num1*num1;
	}
}//end of class
