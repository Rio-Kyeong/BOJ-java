package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Joon2455 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = 0, max_total = 0;

        for(int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            max = (max - out) + in;

            if(max_total < max){
                max_total = max;
            }
        }
        System.out.println(max_total);
    }
}
