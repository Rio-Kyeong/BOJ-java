package inputOutput;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 사칙연산
 */
public class Joon10869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a+b).append("\n")
                .append(a-b).append("\n")
                .append(a*b).append("\n")
                .append(a/b).append("\n")
                .append(a%b);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
