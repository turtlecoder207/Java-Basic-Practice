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
			System.out.println("0~100 ���� ��ǥ�� �Է����ּ���");
		
		}
	}
	
	public void setX(int px)
	{
		if(px>=0 && px<=100){
			x = px;
		}
		else
		{
			System.out.println(px + "�� �ùٸ� ���� �ƴմϴ�.");
			System.out.println("0~100 ���� ��ǥ�� �Է����ּ���");
		}
	}
	public void setY(int py)
	{
		if(py>=0 && py<=100){
			y = py;
		}
		else
		{
			System.out.println(py + "�� �ùٸ� ���� �ƴմϴ�.");
			System.out.println("0~100 ���� ��ǥ�� �Է����ּ���");
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
		//�����ڿ� �μ� ���� ��
		System.out.println("�����ڿ� �μ� ���� ��..");
		MyPoint1 mypoint1 = new MyPoint1();
		int x1 = mypoint1.getX();
		int y1 = mypoint1.getY();
		System.out.println("x1 ��ǥ��: "+x1);
		System.out.println("y1 ��ǥ��: "+y1);
		
		//�����ڿ� �μ� ���� �� Q.������ ���� �߻� �� �μ� ���� �����ڸ� ȣ���ϳ�?
		System.out.println("�����ڿ� 100�� �Ѵ� �μ��� �Ѱ��� ��..");
		MyPoint1 mypoint2 = new MyPoint1(102,300);
		int x2 = mypoint2.getX();
		int y2 = mypoint2.getY();
		System.out.println("x2 ��ǥ��: "+x2);
		System.out.println("y2 ��ǥ��: "+y2);
		
		System.out.println("�����ڿ� 100�� �Ѵ� �μ��� �Ѱ��� ��..");
		MyPoint1 mypoint3 = new MyPoint1(10,99);
		int x3 = mypoint3.getX();
		int y3 = mypoint3.getY();
		System.out.println("x3 ��ǥ��: "+x3);
		System.out.println("y3 ��ǥ��: "+y3);
		
		System.out.println("x, y ��ǥ�� ���� �Է��غ���");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strX = br.readLine();
		String strY = br.readLine();
		
		mypoint2.setX(Integer.parseInt(strX));
		mypoint2.setY(Integer.parseInt(strY));
		
		x2 = mypoint2.getX();
		y2 = mypoint2.getY();
		System.out.println("�ٲ� x2 ��ǥ��: "+x2);
		System.out.println("�ٲ� y2 ��ǥ��: "+y2);
		
	}

}
