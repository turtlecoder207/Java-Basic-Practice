import java.io.*;

public class Ch4hw3 {
	public static void main (String[] args) throws IOException
	{
		System.out.println("�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		System.out.println("���ﰢ���� ���̴� " + ((num1*num2)/2)+"�Դϴ�.");
		
	}
}
