package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소트인사이드
 */
public class Joon1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("");

        int[] arr = new int[str.length];

        for(int i = 0; i < str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int index = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    index = arr[j];
                    arr[j] = arr[i];
                    arr[i] = index;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
