package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Joon1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String decimal = br.readLine();
		StringTokenizer st = new StringTokenizer(decimal," ");
		
		if(st.countTokens() != n) {
			System.out.println(n+"���� �ٽ� �Է����ּ���.");
			return;
		}
		
		int cnt = 0;
		boolean flag = false;
		
		for(int i = 0; i < n; i++) {
			int eq = Integer.parseInt(st.nextToken());
			if(eq == 1) {
				continue;
			}
			for(int j = 2; j < eq; j++) {//2���� eq������ ������ ��
				
				if(eq % j == 0) { //�������� 0�̶�� �Ҽ��ƴ�
					flag = true;
				}
			}	
			if(flag == false) {
				cnt++;
			}
			flag = false;
		}
		
		System.out.println(cnt);
		
	}

}
