package math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 직각삼각형
 */
public class Joon4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true){

            st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 || b == 0 || c == 0){
                break;
            }

            int squaredA = a*a;
            int squaredB = b*b;
            int squaredC = c*c;

            if(squaredA+squaredB == squaredC || squaredA+squaredC == squaredB || squaredB+squaredC == squaredA){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}
