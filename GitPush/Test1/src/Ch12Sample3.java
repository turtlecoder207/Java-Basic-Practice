interface iVehicle{
	void show();
}

class Car3 implements iVehicle{
	private int num;
	private double gas;
	public Car3(int n, double g){
		num =n;
		gas =g;
		System.out.println("차량번호가"+num+"이며, 연료 양이"+gas+"인 자동차가 만들어졌습니다.");
	}
	public void show()
	{
		System.out.println("차량번호는"+num+"입니다.");
		System.out.println("연료 양은"+gas+"입니다.");
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
