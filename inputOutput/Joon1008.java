package inputOutput;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A/B
 */
public class Joon1008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        bw.write(String.valueOf(a/b));
        bw.flush();
        bw.close();
    }
}
