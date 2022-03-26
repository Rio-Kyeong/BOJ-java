package formun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Joon8393 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			 sum += i;
		}
		
		bw.write(Integer.toString(sum)); 
			
		br.close();
		bw.flush();
		bw.close();
	}

}
