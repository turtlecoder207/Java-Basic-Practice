import java.io.*;
public class Ch7hw1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("5명의 시험 점수를 입력하십시오.");
		//배열 선언
		int [] stu;
		stu = new int[5];
		
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		for(int i=0; i<5;i++){
			stu[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<5;i++){
			System.out.println((i+1)+"번째 사람의 점수는"+stu[i]+"입니다.");
		}
		
		for(int s=0; s<stu.length-1;s++){
			for(int t=s+1; t<stu.length;t++){
				if(stu[t]>stu[s]){
					int tmp = stu[t];
					stu[t] = stu[s];
					stu[s]=tmp;
					
				}
			}
		}
		
		System.out.println("가장 높은 점수는"+stu[0]+"입니다.");


	}

}
