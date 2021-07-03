package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class joon10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String s = br.readLine();
 
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
    
			if(arr[ch - 'a'] == -1) {// arr 원소값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int result : arr) {
			System.out.print(result + " ");
		}
	}
}
