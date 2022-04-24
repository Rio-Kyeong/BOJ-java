package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 프린터 큐
 */
public class Joon1966 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0; //출력 횟수

            Queue<int[]> queue = new LinkedList<>(); // Queue 로 활용 할 연결리스트
            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < n; j++){ // Queue 자료 입력
                // { 초기 위치, 중요도 }
                queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
            }

            while (true){
                int[] now = queue.remove(); // queue 첫번째 값 제거
                boolean flag = true;

                for(int[] q : queue){
                    if(q[1] > now[1]){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    count++;
                    if(now[0] == m){
                        break;
                    }
                }else {
                    queue.add(now);
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }
}
