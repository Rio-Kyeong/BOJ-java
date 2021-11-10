package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 브루트 포스(Brute Force)
 * - 가능한 모든 경우에 대해 모두 직접 해 보는 방법
 * - 방법의 개수가 적을 때만 사용할 수 있는 방법
 * - 예를 들어, 비밀번호가 4자리이고, 숫자로만 이루어져 있다고 한다면
 * - 0000부터 9999까지 다 입력해본다. 경우의 수는 10,000가지
 * - 브루트 포스 문제 풀기
 *   1. 문제의 가능한 경우의 수를 계산해본다.
 *   2. 가능한 모든 방법을 다 만들어본다.
 *   3. 각각의 방법을 이용해 답을 구해본다.
 * 블랙잭
 * - 각 카드는 양의 정수
 * - N장의 카드중에서 3장을 뽑아서 딜러가 말한 숫자 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 */
public class Joon2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int result = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 3개를 고르기 때문에 첫번째 카드는 n-2 까지만 순회
        loop1:
        for(int i = 0; i < n-2; i++){
            // 두 번째 카드는 첫 번째 카드 다음부터 n-1 까지만 순회
            for(int j = i+1; j < n-1; j++){
                // 세 번째 카드는 두 번째 카드 다음부터 n 까지 순회
                for(int k = j+1; k < n; k++){

                    int add = arr[i] + arr[j] + arr[k];

                    if(m == add) {
                        result = add;
                        break loop1; // 전체 for문을 빠져나감
                    }

                    if(result < add && add < m){ // 세 카드의 합이 이전 합보다 크면서 m 보다 작을 경우 result 갱신
                        result = add;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
