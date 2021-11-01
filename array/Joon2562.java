package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joon2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		int[] arr = new int[9];
		int max = 1;
		int cnt = 0;
		int index = 0;
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		for(int j : arr) {
			cnt++;
			if(max < j) {
				max = j;
				index = cnt;
			}
		}
	
		
		System.out.println(max+"\n"+ index);
	}

}
