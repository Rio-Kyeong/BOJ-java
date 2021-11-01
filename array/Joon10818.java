package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class joon10818 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
//		int max = -999999;
//		int min = 999999;
		
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		

		for(int j = 0; j < arr.length; j++){
			arr[j] = Integer.parseInt(st.nextToken());
			
//			if(max < arr[j]) {
//				max = arr[j];
//			}
//			
//			if(min > arr[j]) {
//				min = arr[j];
//			}
			
		}
		
		//¹è¿­Á¤·Ä Arrays.sort();
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
		
		
		
	}

}
