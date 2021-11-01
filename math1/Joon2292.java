package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Joon2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = 1;
		int cnt = 1;
		int sum = 6;
		
		while(true) {
			if( n <= cnt) {
				break;
			}
			cnt += sum;
			sum += 6;
			result++;
		}
		
		System.out.println(result);
		
		
	}

}
