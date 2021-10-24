package formun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class joon2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuffer sb; 
		for(int i = n; i >= 1; i--) {
			sb = new StringBuffer();
			bw.write(sb.append(i).append("\n").toString());	
		}
		
	br.close();
	bw.flush();
	bw.close();
	}

}
