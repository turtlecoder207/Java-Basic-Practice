import java.io.*;
public class Ch4hw2 {
	public static void main (String[] args) throws IOException
	{
		System.out.println("정사각형의 한 변의 길이를 입력하십시오");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		System.out.println("정사각형의 넓이는 " + (num1*num1)+"입니다.");
		
	}
}
