import java.io.*;
public class Ch4hw2 {
	public static void main (String[] args) throws IOException
	{
		System.out.println("���簢���� �� ���� ���̸� �Է��Ͻʽÿ�");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		System.out.println("���簢���� ���̴� " + (num1*num1)+"�Դϴ�.");
		
	}
}
