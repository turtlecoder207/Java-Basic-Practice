import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ch10hw2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("a�� �� ��ġ�� ������ �Է��Ͻʽÿ�.");
		BufferedReader br1 = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str2 = br1.readLine();
		int num = Integer.parseInt(str2);
		
		StringBuffer str3 = new StringBuffer(str1);
		str3.insert(num, 'a');
		
		System.out.println(str3+"�� �Ǿ����ϴ�.");
	}

}