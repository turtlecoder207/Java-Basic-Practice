import java.io.*;
public class Ch5hw3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("0���� 10������ ���� �Է��Ͻʽÿ�");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		if(num1>=0 && num1<=10){
			System.out.println("�����Դϴ�.");
		}
		else{
			System.out.println("�����Դϴ�.");
		}
			
	}

}
