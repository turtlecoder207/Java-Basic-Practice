class Car2{
	private int num;
	private double gas;
	
	public Car2()
	{ 
		num =0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public void setCar(int n, double g){
		num =n;
		gas =g;
		System.out.println("차량번호를 "+num +"으로, 연료 양을  "+gas+"로 바꿨습니다.");
	}
	
	public void show(){
		System.out.println("차량 번호 "+num+" 연료 양 " +gas+" 인 자동차입니다.");
		
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
