package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 수 정렬하기 2
 */
public class Joon2751_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        for(int value : list){
            sb.append(value).append("\n");
        }
        System.out.println(sb.toString());
    }
}
