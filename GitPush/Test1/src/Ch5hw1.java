import java.io.*;
public class Ch5hw1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하십시오");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		if(num1%2==0){
			System.out.println(num1+ "(은)는 짝수입니다.");
		}
		else {
			System.out.println(num1+ "(은)는 홀수입니다.");
		}
	}

}
