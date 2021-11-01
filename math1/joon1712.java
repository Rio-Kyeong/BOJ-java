package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Joon1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input," ");
		
		int a = Integer.parseInt(st.nextToken()); //�������
		int b = Integer.parseInt(st.nextToken()); //�������
		int c = Integer.parseInt(st.nextToken()); //�Ǹź��
		int cnt = 0;
		
		if(b >= c) {
			cnt = -1;
		}else {
			cnt = a/(c-b)+1;
		}
		System.out.println(cnt);
	}

}
