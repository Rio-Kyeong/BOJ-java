package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class joon1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			if(check() == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static boolean check() throws IOException{ 
		boolean[] check = new boolean[26];
		int prev = 0;
		String word = br.readLine();
		
		for(int i = 0; i < word.length(); i++) {
			int now = word.charAt(i); //현재 문자 유니코드로 얻기
			
			if(prev != now) { //앞선 문자와 i번째 문자가 같지 않다면?
				
				if(check[now - 'a'] == false) { //해당 문자가 처음 나오는 경우(false인 경우)
					check[now - 'a'] = true; //now에 해당하는 배열위치를 true로 변경
					prev = now; //앞선 문자를 현재 문자로 변경
				}else { //해당 문자가 나온 적이 있는 경우 - true인 경우(그룹단어x)
					return false;
				}
			}else { //앞선 문자와 i 번째 문자가 같다면? (연속된 문자) 
				continue;
			}	
		}
		return true;
	}
}//class
