import java.io.*;
public class Ch6hw5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("2 �̻��� ������ �Է��Ͻÿ�.");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num = Integer.parseInt(str1);
		
		for(int i=2;i<=num;i++){
			if(i==num){
				System.out.println(num+"�� �Ҽ��Դϴ�.");
				
			}
			else if(num%i==0){
				System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
				break;
		}

	}

}
}