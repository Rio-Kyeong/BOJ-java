package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 네 번째 점
 */
public class joon3009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arrayX = new int[3];
        int[] arrayY = new int[3];

        int x, y;

        for(int i = 0; i < 3; i++){
            arrayX[i] = Integer.parseInt(st.nextToken());
            arrayY[i] = Integer.parseInt(st.nextToken());

            if(i == 0 || i == 1){
                st = new StringTokenizer(br.readLine(), " ");
            }
        }

        if(arrayX[0] == arrayX[1]){
            x = arrayX[2];
        }else if(arrayX[0] == arrayX[2]){
            x = arrayX[1];
        }else {
            x = arrayX[0];
        }

        if(arrayY[0] == arrayY[1]){
            y = arrayY[2];
        }else if(arrayY[0] == arrayY[2]){
            y = arrayY[1];
        }else {
            y = arrayY[0];
        }

        System.out.println(x+" "+y);
    }
}
