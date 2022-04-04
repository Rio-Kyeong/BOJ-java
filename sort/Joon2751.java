package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 수 정렬하기 2
 */
public class Joon2751 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        // 시간 초과
        // Arrays.sort(arr);

        Collections.sort(list);

        for (int value : list) {
           bw.write(String.valueOf(value));
           bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
