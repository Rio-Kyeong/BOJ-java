package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 3
 */
public class Joon10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 수는 10,000보다 작거나 같은 자연수
        // 수의 범위 (0 ~ 10000) 사실상 0은 제외
        int[] cnt = new int[10001];

        for(int i = 0; i < n; i++){
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            // 중복데이터가 있으므로 누적한 인덱스의 값을 한 개씩 줄이면서
            // 0 이 될 때 까지 출력해주어야 한다는 점
            while (cnt[i] > 0){
                sb.append(i).append("\n");
                cnt[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}
