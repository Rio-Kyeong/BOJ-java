import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int a;
		int b;
		
		StringTokenizer st ;
		StringBuilder sb;
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb = new StringBuilder();
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append((a+b)).append("\n").toString());
		}
		
	br.close();
	bw.flush();
	bw.close();
	}
	
}