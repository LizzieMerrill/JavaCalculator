import java.lang.Math;
//more functional extension of Calculator class
public class MagicCalculator extends Calculator {
	public static double squareRoot(double num) {
		return Math.sqrt(num);
	}
	public static double sin(double num) {
		return Math.sin(num);
	}
	public static double cosine(double num) {
		return Math.cos(num);
	}
	public static double tangent(double num) {
		return Math.tan(num);
	}
	public static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i < num; ++i) {
			factorial = factorial*i;
		}
		return factorial;
	}
}//end of class
