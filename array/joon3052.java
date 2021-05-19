package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class joon3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int cnt = 0;
		
		for(int i = 0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
			
		}
			
			
		for(int i = 0; i<arr.length; i++) {
			int cnt1 = 0;
			for(int j = i+1; j <arr.length; j++) {
				if(arr[i] == arr[j]) {
					cnt1++;
					}
				}
				if(cnt1 == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
	}

}
