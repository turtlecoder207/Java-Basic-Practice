import java.io.*;
public class Ch3P5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		System.out.println("Ű�� "+ num1 + "��Ƽ�����Դϴ�.");
		System.out.println("�����Դ� " + num2 + "ų�α׷��Դϴ�.");

	}

}
