import java.io.*;
public class Ch5hw2 
{
	public static void main(String[] args) throws IOException
	{
	System.out.println("2���� ������ �Է��Ͻʽÿ�.");
	BufferedReader br = 
			new BufferedReader (new InputStreamReader(System.in));
	String str1 = br.readLine();
	String str2 = br.readLine();
	
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	
	if(num1==num2){
		System.out.println("�� ���ڴ� �����ϴ�");
	}
	else if(num1>num2){
		System.out.println(num2+"���� "+num1+"�� Ů�ϴ�.");
	}
	else if(num1<num2){
		System.out.println(num1+"���� "+num2+"�� Ů�ϴ�.");
	}
	}
}