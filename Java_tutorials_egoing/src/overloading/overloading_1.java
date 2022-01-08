package overloading;

class Calculator{
	int left, right;
	int third = 0;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}	

	public void setOperands(int left, int right, int third) {//overloading�̶� method �̸��� ���Ƶ� parameter������ �޶� ��밡���� �޼ҵ�
		this.setOperands(left, right);  // �̷��� �ݺ��� ���� �� �ִ�. Ŭ���� �ڱ��ڽ��� �޼ҵ带 �ٸ� �޼ҵ忡�� this.�� �ٿ� ��밡��. -> ����������
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