package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class joon1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String decimal = br.readLine();
		StringTokenizer st = new StringTokenizer(decimal," ");
		
		if(st.countTokens() != n) {
			System.out.println(n+"개를 다시 입력해주세요.");
			return;
		}
		
		int cnt = 0;
		boolean flag = false;
		
		for(int i = 0; i < n; i++) {
			int eq = Integer.parseInt(st.nextToken());
			if(eq == 1) {
				continue;
			}
			for(int j = 2; j < eq; j++) {//2부터 eq전까지 나머지 비교
				
				if(eq % j == 0) { //나머지가 0이라면 소수아님
					flag = true;
				}
			}	
			if(flag == false) {
				cnt++;
			}
			flag = false;
		}
		
		System.out.println(cnt);
		
	}

}
