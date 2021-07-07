package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class joon2908 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input," ");
		
		/*
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int c, d;
		
		for(int i = 2; i >= 0; i--) {
			c = Integer.parseInt(sb.append(a.charAt(i)).toString());
			d = Integer.parseInt(sb1.append(b.charAt(i)).toString());
			
			if(i == 0) {
				System.out.println(c>d?c:d);				
			}
		}	
	*/
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(a>b?a:b);
		
	}
	
}
