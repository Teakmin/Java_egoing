package inharitnace;

class multiplicationableCalculator extends Calculator {
	public multiplicationableCalculator(int left, int right) {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		multiplicationableCalculator c1 = new multiplicationableCalculator(10, 20);
		c1.sum();


	}

}
