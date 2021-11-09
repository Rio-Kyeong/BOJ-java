package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 하노이 탑 원판 이동 순서
 * 작은 원판 위에 큰 원판은 올 수 없다.
 * 1. 가장 큰 마지막 원판을 C로 옮기기 위해서는 n-1 개의 원판이 A에서 B로 가야한다. -> Hanoi(n-1)
 * 2. 그리고 A에 있는 가장 큰 원판이 C로 이동한다. -> Hanoi(1)
 * 3. B에 있는 (n-1)개의 원판을 C로 이동한다. -> Hanoi(n-1)
 * Hanoi(n) = 2 x Hanoi(n-1) + 1
 * 원판 n개 일 때, 2ⁿ - 1 번의 이동으로 원판을 모두 옮길 수 있다.
 */
public class Joon11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        sb.append((int)Math.pow(2, n) - 1).append('\n');

        hanoi(n, 1, 2, 3);
        System.out.println(sb.toString());
    }

    /**
     * @param n 원판의 개수
     * @param start 출발지
     * @param mid 옮기기 위해 잠시 거치는 장소
     * @param to 목적지
     */
    public static void hanoi(int n, int start, int mid, int to){

        if(n == 1){
           sb.append(start).append(" ").append(to).append("\n");
           return;
        }

        // STEP 1 : N-1개를 A에서 B로 이동
        hanoi(n - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동
        sb.append(start).append(" ").append(to).append("\n");

        // STEP 3 : N-1개를 B에서 C로 이동
        hanoi(n - 1, mid, start, to);
    }
}
