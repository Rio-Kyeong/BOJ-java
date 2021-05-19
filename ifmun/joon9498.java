package ifmun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon9498 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		
		if(100>=score && score>=90) {
			System.out.println('A');
		}else if(89>=score && score>=80) {
			System.out.println('B');
		}else if(79>=score && score>=70) {
			System.out.println('C');
		}else if(69>=score && score>=60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
		
		br.close();
	}

}
