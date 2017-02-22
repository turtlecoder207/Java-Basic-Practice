class MyPoint
{
			int x;
			int y;
			
			void setX(int px){
				this.x = px;
			}
			void setY(int py){
				this.y = py;
			}
			int getX(){
				return x;
			}
			int getY(){
				return y;
			}
}
public class Ch8hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point1 = new MyPoint();
		point1.setX(1);
		point1.setY(2);
		
		int num1 = point1.getX();
		int num2 = point1.getY();
		
		System.out.println("x ÁÂÇ¥´Â"+num1);
		System.out.println("y ÁÂÇ¥´Â"+num2);
		
	}

}
