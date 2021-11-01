package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joon8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int cnt = 1;
		String temp = "";
		
		for(int i=0; i<num; i++) {
			temp = br.readLine();
			for(int j=0; j<temp.length(); j++) {
				if(temp.charAt(j) == 'O') {
					arr[i] += cnt;
					cnt++;
				}else {
					cnt = 1;
				}
				
			}
			cnt = 1;
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
		
	}

}
