package arr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Joon1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		double[] arr= new double[n];
		double m = 0;
		double avg = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			
			if(arr[i] > m) {
				m = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			avg += arr[i]*100/m;
			
		}
		
		avg = avg/n;
		
		System.out.println(avg);
		
	}

}
