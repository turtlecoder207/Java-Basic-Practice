import java.io.*;
public class Ch6hw2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		System.out.println("시험 점수를 입력하십시오.(0으로 종료)");
		do{			
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		String str1 = br.readLine();
		num = Integer.parseInt(str1);		
		
		sum = sum+num;
		}
		while (num != 0);
		
		System.out.println("시험 점수의 합계는" + sum+ "점 입니다.");
	}

}
