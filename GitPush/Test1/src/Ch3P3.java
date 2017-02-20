import java.io. *;
public class Ch3P3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("당신은 몇 살입니까?");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("당신은" + num + "살 입니다.");
		
	}

}
