package math1;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * 큰 수 A+B
 * long 형이 넘어가는 매우 큰 수에 대해서는 BigInteger 클래스를 사용할 수도 있다.
 * BigInteger 은 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든지 담을 수 있습니다.
 * 문자열이기에 사칙연산이 안되며, 내부 메서드를 이용해야 한다.
 */
public class Joon10757 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        a = a.add(b);

        System.out.println(a.toString());
    }
}
