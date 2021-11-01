package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Joon2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		String[] arrCon = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i = 0; i < arrCon.length; i++) {
			if(input.contains(arrCon[i])){
				input = input.replaceAll(arrCon[i]," ");
			}
		}
		
		System.out.println(input.length());
		
		}
	}


