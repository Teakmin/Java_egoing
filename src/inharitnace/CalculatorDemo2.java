package inharitnace;

class multiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		multiplicationableCalculator c1 = new multiplicationableCalculator();
		c1.setOperends(10, 20);
		c1.sum();
		c1.multiplication();

	}

}
