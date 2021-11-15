package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 덩치
 */
public class Joon7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            if(i == n-1) break;

            st = new StringTokenizer(br.readLine()," ");
        }

        for(int i = 0; i < n; i++){
            int rank = 1;
            for(int j = 0; j < n; j++){

                if(i == j) continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb.toString());
    }
}
