import java.io.*;
public class Ch5hw4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하십시오.");
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		switch(num1){
		case 1: 
			System.out.println("노력합시다.");
			break;
		case 2:
			System.out.println("조금 더 노력합시다.");
			break;
		case 3:
			System.out.println("더 높은 점수를 목표로합시다.");
			break;
		case 4:
			System.out.println("매우 잘했습니다.");
			break;
		case 5:
			System.out.println("매우 우수합니다.");
			break;
		}
	}

}
