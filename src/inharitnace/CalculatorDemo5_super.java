package inharitnace;

class SubstractionCalculator{
	int left, right;
	public SubstractionCalculator() {}
	public SubstractionCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
}

class MultiplyableCalculator extends SubstractionCalculator{
	int left, right;
	public MultiplyableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
}

public class CalculatorDemo5_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
