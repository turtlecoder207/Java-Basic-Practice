import java.io.*;
public class Ch5hw1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("������ �Է��Ͻʽÿ�");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		if(num1%2==0){
			System.out.println(num1+ "(��)�� ¦���Դϴ�.");
		}
		else {
			System.out.println(num1+ "(��)�� Ȧ���Դϴ�.");
		}
	}

}
