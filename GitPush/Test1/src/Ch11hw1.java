class Car2{
	private int num;
	private double gas;
	
	public Car2()
	{ 
		num =0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	public void setCar(int n, double g){
		num =n;
		gas =g;
		System.out.println("������ȣ�� "+num +"����, ���� ����  "+gas+"�� �ٲ���ϴ�.");
	}
	
	public void show(){
		System.out.println("���� ��ȣ "+num+" ���� �� " +gas+" �� �ڵ����Դϴ�.");
		
	}
}
public class Ch11hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 cartest1;
		cartest1 = new Car2();
		cartest1.setCar(1234, 20.5);
		cartest1.show();
	}

}
