import java.io.*;
class MyPoint1
{
	private int x;
	private int y;
	
	public MyPoint1()
	{
		x = 0;
		y = 0;
	}
	public MyPoint1(int px, int py)
	{
		if (px >=0 && px <=100){
			x = px;	
			
		}
		if(py>=0 && py <=100){
			y = py;
			}
		else {
			System.out.println("0~100 사이 좌표를 입력해주세요");
		
		}
	}
	
	public void setX(int px)
	{
		if(px>=0 && px<=100){
			x = px;
		}
		else
		{
			System.out.println(px + "는 올바른 값이 아닙니다.");
			System.out.println("0~100 사이 좌표를 입력해주세요");
		}
	}
	public void setY(int py)
	{
		if(py>=0 && py<=100){
			y = py;
		}
		else
		{
			System.out.println(py + "는 올바른 값이 아닙니다.");
			System.out.println("0~100 사이 좌표를 입력해주세요");
		}
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	

}
public class Ch9hw1 {

	public static void main(String[] args)throws IOException {
		//생성자에 인수 없을 때
		System.out.println("생성자에 인수 없을 때..");
		MyPoint1 mypoint1 = new MyPoint1();
		int x1 = mypoint1.getX();
		int y1 = mypoint1.getY();
		System.out.println("x1 좌표는: "+x1);
		System.out.println("y1 좌표는: "+y1);
		
		//생성자에 인수 있을 때 Q.생성자 오류 발생 시 인수 없는 생성자를 호출하나?
		System.out.println("생성자에 100이 넘는 인수를 넘겼을 때..");
		MyPoint1 mypoint2 = new MyPoint1(102,300);
		int x2 = mypoint2.getX();
		int y2 = mypoint2.getY();
		System.out.println("x2 좌표는: "+x2);
		System.out.println("y2 좌표는: "+y2);
		
		System.out.println("생성자에 100이 넘는 인수를 넘겼을 때..");
		MyPoint1 mypoint3 = new MyPoint1(10,99);
		int x3 = mypoint3.getX();
		int y3 = mypoint3.getY();
		System.out.println("x3 좌표는: "+x3);
		System.out.println("y3 좌표는: "+y3);
		
		System.out.println("x, y 좌표를 직접 입력해보자");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strX = br.readLine();
		String strY = br.readLine();
		
		mypoint2.setX(Integer.parseInt(strX));
		mypoint2.setY(Integer.parseInt(strY));
		
		x2 = mypoint2.getX();
		y2 = mypoint2.getY();
		System.out.println("바뀐 x2 좌표는: "+x2);
		System.out.println("바뀐 y2 좌표는: "+y2);
		
	}

}
