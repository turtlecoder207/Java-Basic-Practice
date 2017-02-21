
public class Ch4hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test22
		int num1 = 0;
		int num2 = 4;
		
		int res = num1- num2;
		
		System.out.println("0-4="+ res);
		
		double num3 = 3.14;
		num1 = 2;
		
		System.out.println("3.14x2 = "+ (num3*num1));
		
		num1=5;
		num2=3;
		
		double res2 = (double)num1/num2;
		
		System.out.println("5%3="+res2);
		
		num1= 30;
		num2 = 7;
		
		System.out.println("30%7의 나머지:"+(num1%num2));
		
		num1 = 7;
		num2 = 32;
		num3 = 5;
		
		res2 = ((double)num1+(double)num2)/5;
		
		System.out.println("(7+32)%5=" + res2);
	}

}
