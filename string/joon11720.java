package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class joon11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		String plus = br.readLine();
		
		String[] arr = new String[n];
		int result = 0;
		arr = plus.split("");
		
		for(int i =0; i < arr.length; i++) {
			result += Integer.parseInt(arr[i]);
		}
		bw.write(String.valueOf(result));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
