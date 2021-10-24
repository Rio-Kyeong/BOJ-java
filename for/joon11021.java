package formun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class joon11021 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuffer sb;
		for(int i=1; i<=t; i++){
			st = new StringTokenizer(br.readLine()," ");
			sb = new StringBuffer();
			bw.write(sb.append("Case #"+i+": ").append(Integer.parseInt(st.nextToken())
					+ Integer.parseInt(st.nextToken()) + "\n").toString());
		
		}
		br.close();
		bw.flush();
		bw.close();
		
	}

}
