package whilemun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class joon1110 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		
		
		int i, j, p;
		int cnt = 0;
		int copy = n;
		
		while(true) {
			
			i = copy/10; 
			j = copy%10; 
			
			p = i+j; 
			
			if(p > 9) {
				p = p%10;
			}
			
			copy = (j*10)+p;
			cnt++;
			
			if(n == copy){
				System.out.println(cnt);
				break;
			}	
		}
		
	}

}
