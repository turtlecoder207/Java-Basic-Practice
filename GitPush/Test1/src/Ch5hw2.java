import java.io.*;
public class Ch5hw2 
{
	public static void main(String[] args) throws IOException
	{
	System.out.println("2개의 정수를 입력하십시오.");
	BufferedReader br = 
			new BufferedReader (new InputStreamReader(System.in));
	String str1 = br.readLine();
	String str2 = br.readLine();
	
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	
	if(num1==num2){
		System.out.println("두 숫자는 같습니다");
	}
	else if(num1>num2){
		System.out.println(num2+"보다 "+num1+"이 큽니다.");
	}
	else if(num1<num2){
		System.out.println(num1+"보다 "+num2+"이 큽니다.");
	}
	}
}