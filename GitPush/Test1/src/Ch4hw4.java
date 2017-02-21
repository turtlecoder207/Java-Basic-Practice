import java.io.*;
public class Ch4hw4 {
	public static void main (String[] args) throws IOException
	{
		System.out.println("과목 1~5의 점수를 정수로 입력하십시오");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);
		double num4 = Double.parseDouble(str4);
		double num5 = Double.parseDouble(str5);
		
		
		System.out.println("과목의 합계는 " + (int)(num1+num2+num3+num4+num5)+"입니다.");
		System.out.println("과목의 평균은 " + ((num1+num2+num3+num4+num5)/5)+"입니다.");
		
	}
}
