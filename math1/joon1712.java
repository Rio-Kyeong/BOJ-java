package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class joon1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input," ");
		
		int a = Integer.parseInt(st.nextToken()); //고정비용
		int b = Integer.parseInt(st.nextToken()); //가변비용
		int c = Integer.parseInt(st.nextToken()); //판매비용
		int cnt = 0;
		
		if(b >= c) {
			cnt = -1;
		}else {
			cnt = a/(c-b)+1;
		}
		System.out.println(cnt);
	}

}
