package function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class joon1065 {
	
	public static int sequence(int n) {
		int hansuCnt = 0;
		
		for(int i = 1; i <= n; i++) {
			
				if(0 < i && i < 100) {
					hansuCnt++;
				}
				if(100 <= i && i < 1000) {
					int one = i % 10;
					int two = (i-one) / 10 % 10;
					int three = (i-two-one) / 100 % 10;
					if((three - two) == (two - one)){
						hansuCnt++;
					}
				}
			}
		
		return hansuCnt;
	}
	
	//stream¿¬½À
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		try {
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(sequence(n))); 
			br.close();
			bw.flush();
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
