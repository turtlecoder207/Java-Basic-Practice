interface iVehicle{
	void show();
}

class Car3 implements iVehicle{
	private int num;
	private double gas;
	public Car3(int n, double g){
		num =n;
		gas =g;
		System.out.println("������ȣ��"+num+"�̸�, ���� ����"+gas+"�� �ڵ����� ����������ϴ�.");
	}
	public void show()
	{
		System.out.println("������ȣ��"+num+"�Դϴ�.");
		System.out.println("���� ����"+gas+"�Դϴ�.");
	}
}
public class Ch12Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle[] ivc;
		ivc = new iVehicle[1];
		
		ivc[0] = new Car3(1234,20.5);
		
		ivc[0].show();
	}

}
