package inharitnace;

class divisionableCalculator extends multiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		divisionableCalculator c1 = new divisionableCalculator();
		c1.setOperends(20, 10);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();
	}
}
