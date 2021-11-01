package ifmun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joon2884 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int H = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
	
		if(M>=45) {
			M = M-45;
			System.out.println(H+" "+M);
		}else if(M<45) {
			H--;
			M = 60-(45-M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H+" "+M);	
		}
		br.close();
	}
}
