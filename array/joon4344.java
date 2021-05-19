package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class joon4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		 
		
		
		int[] arr;
		StringTokenizer st; 
		
		for(int i = 0; i< c; i++){
			
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			double sum = 0;
			
			for(int j = 0; j < n; j++){
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val;
			}	
			
			double mean = sum/n;
			double cnt = 0;
			
			for(int j = 0; j < n; j++){
				if(mean < arr[j]) {
					cnt++;
				}
			}	
			
			System.out.printf("%.3f%%\n",(cnt/n)*100);
			
		}
	}
}


