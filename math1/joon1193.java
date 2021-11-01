package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 발견한 규칙 :
 * 행 번호(line)+1 = 분모 + 분자
 * 짝수 행은 오른쪽에서 왼쪽, 홀수 행은 왼쪾에서 오른쪽으로 순서가 커진다.
 * 행 번호(line)와 분수의 숫자는 같다.
 */
public class Joon1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine()); //원하는 분수의 번호
        int cnt = 0; // 개수
        int line = 0; // 행

        while(true){
            line++;//5
            cnt += line; //1+2+3+4+5 = 15
            if(cnt >= x){ //15 >= 14 // 14번째 숫자는 5열에 있다.
                if(line % 2 == 0){
                    System.out.println(x-cnt+line+"/"+(cnt-x+1));
                }else{
                    System.out.println((cnt-x+1)+"/"+(x-cnt+line));
                }//15-14+1 / 14-15+5 = 2/4
                break;
            }
        }
    }
}


