import java.io. *;
public class Ch3P3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("����� �� ���Դϱ�?");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("�����" + num + "�� �Դϴ�.");
		
	}

}
