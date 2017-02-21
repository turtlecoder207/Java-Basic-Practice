import java.io.*;

public class Ch4hw3 {
	public static void main (String[] args) throws IOException
	{
		System.out.println("삼각형의 밑변과 높이를 입력하십시오");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		System.out.println("정삼각형의 넓이는 " + ((num1*num2)/2)+"입니다.");
		
	}
}
