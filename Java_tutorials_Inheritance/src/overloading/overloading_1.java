package overloading;

class Calculator{
	int left, right;
	int third = 0;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}	

	public void setOperands(int left, int right, int third) {//overloading이란 method 이름이 같아도 parameter개수가 달라서 사용가능한 메소드
		this.setOperands(left, right);  // 이렇게 반복을 줄일 수 있다. 클래스 자기자신의 메소드를 다른 메소드에서 this.를 붙여 사용가능. -> 유지보수성
		this.third = third;
	}
	
	public int sum2() {
		return this.left + this.right;
	}
	
	public int sum3() {
		return this.left + this.right + this.third;
	}
}

public class overloading_1 {
	
	public static void main(String args[]) {

		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.setOperands(10, 20, 30);
		System.out.println(c1.sum2());
		System.out.println(c1.sum3());
	}
}
