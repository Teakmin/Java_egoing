package overriding;

class SubstractionCalculator{
	int left, right;
	public SubstractionCalculator() {}		//�⺻������(����Ŭ�������� ����Ŭ���� �⺻�����ڸ� �ʿ����)
	public SubstractionCalculator(int left, int right) {
		this.left = left;					//������
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
		return super.sum();		//super�� �θ� Ŭ������ �ǹ�. overriding�Ϸ��� �θ�� �޼ҵ� return type, �̸�, �Ű����� ����&������Ÿ��&���� ���� ���ƾ���.
	}
}


public class overriding_1 {
	public static void main(String[] args) {
	}
}
