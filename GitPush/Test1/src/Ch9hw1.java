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
		x = px;
		y = py;
	}
	
	public void setX(int px)
	{
		if(px>=0 && px<=100){
			x = px;
		}
		else
		{
			System.out.println("0~100 »çÀÌ ÁÂÇ¥¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
		}
	}
	public void setY(int py)
	{
		if(py>=0 && py<=100){
			y = py;
		}
		else
		{
			System.out.println("0~100 »çÀÌ ÁÂÇ¥¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint1 mypoint1 = new MyPoint1();
		int x1 = mypoint1.getX();
		int y1 = mypoint1.getY();
		System.out.println("x1 ÁÂÇ¥´Â: "+x1);
		System.out.println("y1 ÁÂÇ¥´Â: "+y1);
		
		MyPoint1 mypoint2 = new MyPoint1(50,99);
		int x2 = mypoint2.getX();
		int y2 = mypoint2.getY();
		System.out.println("x2 ÁÂÇ¥´Â: "+x2);
		System.out.println("y2 ÁÂÇ¥´Â: "+y2);
	}

}
