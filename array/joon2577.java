package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joon2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int result = a*b*c;
		int[] arr = new int[10];
		int num ;
		
		while(result != 0) {
			num = result%10;
			arr[num] += 1;
			result = result/10;
		}

		for(int input : arr) {
			System.out.println(input);
		}
		
	}

}
