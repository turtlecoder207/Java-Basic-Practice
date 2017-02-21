import java.io.*;
public class Ch5hw3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("0에서 10까지의 수를 입력하십시오");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		if(num1>=0 && num1<=10){
			System.out.println("정답입니다.");
		}
		else{
			System.out.println("오답입니다.");
		}
			
	}

}
