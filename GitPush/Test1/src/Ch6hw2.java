import java.io.*;
public class Ch6hw2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		System.out.println("���� ������ �Է��Ͻʽÿ�.(0���� ����)");
		do{			
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		String str1 = br.readLine();
		num = Integer.parseInt(str1);		
		
		sum = sum+num;
		}
		while (num != 0);
		
		System.out.println("���� ������ �հ��" + sum+ "�� �Դϴ�.");
	}

}
