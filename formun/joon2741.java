package formun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class joon2741 {

	public static void main(String[] args)throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int N = Integer.parseInt(br.readLine());
			StringBuilder sb;
			
			for(int i=1; i<=N; i++) {
				sb = new StringBuilder();
				bw.write(sb.append(i).append("\n").toString());
			}
			br.close();
			bw.flush();
			bw.close();
			}
		}
