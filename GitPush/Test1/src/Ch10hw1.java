import java.io.*;
public class Ch10hw1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���ڿ��� �Է��Ͻʽÿ�.");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		
		System.out.println(str1+"�� �Ųٷ� ������ "+str2);
	}

}
