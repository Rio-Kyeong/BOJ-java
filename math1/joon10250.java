package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * W개 방이 있는 H층 건물 (H x W 형태 호텔)
 * 호텔 정문은 일층 엘리베이터 바로 앞
 * 모든 인접한 두 방 사이의 거리는 1
 * 손님은 층 상관없이 가장 가까운 방을 선호한다.
 * 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호는?
 * T(테스트 데이터)
 * H(호텔의 층 수) W(각 층의 방) N(몇 번째 손님)
 */
public class joon10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer stringTokenizer;

        int[] arr = new int[t];
        int h, w, n, floor, room;

        for (int i = 0; i < t; i++) {
            stringTokenizer = new StringTokenizer(br.readLine()," ");

            h = Integer.parseInt(stringTokenizer.nextToken()); // 층
            w = Integer.parseInt(stringTokenizer.nextToken()); // 방
            n = Integer.parseInt(stringTokenizer.nextToken()); // N번째 손님

            floor = n%h;
            room = n/h+1;

            // 꼭대기 층일 경우
            if(n%h == 0){
                room = n/h;
                floor = h;
            }
            arr[i] = (floor * 100)+room;
        }

        //output
        for (int number : arr) {
            System.out.println(number);
        }
    }
}
