import java.io.*;
public class Ch3P4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�������� ���� ���Դϱ�?");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double num = Double.parseDouble(str);
		System.out.println("�������� ����" + num +"�Դϴ�.");

	}

}
