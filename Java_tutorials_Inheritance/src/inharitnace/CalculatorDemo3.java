package inharitnace;

class divisionableCalculator{
	int left, right;
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		divisionableCalculator c1 = new divisionableCalculator();
	}
}
