package math1;

import java.io.*;
import java.util.StringTokenizer;

public class Joon2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken()); // 낮에 올라가는 미터
        int b = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 미터
        int v = Integer.parseInt(st.nextToken()); // 나무 막대 높이

        int day = (v-b)/(a-b);
        if((v-b)%(a-b) != 0){
            day++;
        }

        bw.write(String.valueOf(day));
        bw.flush();
        br.close();
        bw.close();

        /*
        반복문으로 했더니 시간초과로 통과되지 않는다...

        int temp = 0;
        int day = 1;
        boolean flag = false;
        // false : 낮
        // true : 밤

        while (true){
            if(!flag){
                cnt += a;
                flag = true;
            }else{
                cnt -= b;
                day++;
                flag = false;
            }
            if(v <= cnt) {
                bw.write(String.valueOf(day));
                bw.flush();
                bw.close();
                break;
            }
        }

        */
    }
}//class
