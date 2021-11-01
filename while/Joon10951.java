package whilemun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Joon10951 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String result ;
		
		//print A+B using End of File(EOF)
		while((result = br.readLine())!= null) {
			
			st = new StringTokenizer(result," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append((a+b)).append("\n");		
			}
		
		bw.write(sb.toString());
	
		br.close();
		bw.flush();
		bw.close();
		}
}
