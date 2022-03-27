package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최소공배수
 */
public class Joon1934 {

     public static void main(String[] args) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringBuilder sb = new StringBuilder();

          int t = Integer.parseInt(br.readLine());

          for(int i = 0; i < t; i++){
               StringTokenizer st = new StringTokenizer(br.readLine(), " ");

               int a = Integer.parseInt(st.nextToken());
               int b = Integer.parseInt(st.nextToken());

               int lcm = lcm(a, b);
               sb.append(lcm).append("\n");
          }
          System.out.print(sb.toString());
     }

     public static int gcd(int a, int b){
          while(true){
               if(b != 0){
                    int c = a % b;
                    a = b;
                    b = c;
               }else {
                    break;
               }
          }
          return a;
     }

     public static int lcm(int a, int b){
         return a * (b / gcd(a, b));
     }
}
