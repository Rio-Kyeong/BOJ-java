package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기
 */
public class Joon2750 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                int idx = 0;
                if(arr[i] > arr[j]){
                    idx = arr[i];
                    arr[i] = arr[j];
                    arr[j] = idx;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
