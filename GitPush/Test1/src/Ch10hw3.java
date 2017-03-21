import java.io.*;
public class Ch10hw3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("정수를 2개 입력하십시오");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		BufferedReader br1 = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str2 = br1.readLine();
		int num2 = Integer.parseInt(str2);
		
		int mini = Math.min(num2, num1);
		
		System.out.println(num1+"과 "+num2+ "중 작은 수는 "+mini+"입니다.");
	}

}
