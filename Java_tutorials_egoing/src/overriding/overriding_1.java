package overriding;

class SubstractionCalculator{
	int left, right;
	public SubstractionCalculator() {}		//기본생성자(하위클래스에서 상위클래스 기본생성자를 필요로함)
	public SubstractionCalculator(int left, int right) {
		this.left = left;					//생성자
		this.right = right;
	}
	public int sum() {
		return this.left + this.right;
	}
}

class MultiplyableCalculator extends SubstractionCalculator{
	int left, right;
	public MultiplyableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public int sum() {
		return super.sum();		//super는 부모 클래스를 의미. overriding하려면 부모와 메소드 return type, 이름, 매개변수 개수&데이터타입&순서 들이 가아야함.
	}
}


public class overriding_1 {
	public static void main(String[] args) {
	}
}
