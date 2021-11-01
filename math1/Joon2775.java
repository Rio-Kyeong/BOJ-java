package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 부녀회장이 될테야
 * k층 n호 = (k-1)층 1호 + (k-1)층 2호 + ... + (k-1)층 n호
 *
 */
public class Joon2775 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] apt = new int[15][15];

        for(int i = 0; i < 15; i++){
            apt[i][1] = 1; // i층 1호 : 모두 1로 초기화(무조건 1)
            apt[0][i] = i; // 0층 i호 : 1, 2, 3, 4, 5, ...
        }

        for(int i = 1; i < 15; i++){ // 1층부터 14층까지
            for(int j = 2; j < 15; j++){ // 2호부터 14호까지
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }

        int t = Integer.parseInt(br.readLine()); // Test case

        for(int i = 0; i < t; i++){
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호
            sb.append(apt[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
