import java.io.*;
public class Ch7hw1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("5���� ���� ������ �Է��Ͻʽÿ�.");
		//�迭 ����
		int [] stu;
		stu = new int[5];
		
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		for(int i=0; i<5;i++){
			stu[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<5;i++){
			System.out.println((i+1)+"��° ����� ������"+stu[i]+"�Դϴ�.");
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
		
		System.out.println("���� ���� ������"+stu[0]+"�Դϴ�.");


	}

}
