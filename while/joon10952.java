package whilemun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class joon10952 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st;
		StringBuilder sb;
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			sb = new StringBuilder();
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append((a+b)+"\n");
			
			if(!(a+b == 0)) {
				bw.write(sb.toString());
			}
			
			if(a==0 && b==0) {
				break;
			}
				
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
