import java.io.*;
public class Ch5hw4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��Ͻʽÿ�.");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		switch(num1){
		case 1: 
			System.out.println("����սô�.");
			break;
		case 2:
			System.out.println("���� �� ����սô�.");
			break;
		case 3:
			System.out.println("�� ���� ������ ��ǥ���սô�.");
			break;
		case 4:
			System.out.println("�ſ� ���߽��ϴ�.");
			break;
		case 5:
			System.out.println("�ſ� ����մϴ�.");
			break;
		}
	}

}
