package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2884. 알람 시계
public class Baekjoon2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        // M을 45분 전으로 설정
        M -= 45;

        // 위의 연산으로 인해 M이 음수가 되었을 경우
        // 예) 15시 1분 -> 15시 -44분
        if (M < 0) {
            // 1시간을 줄이고 60분을 더해준다
            // 예) 15시 -44분 -> 14시 16분
            H--;
            M += 60;

            // 위의 연산으로 인해 H가 음수가 되었을 경우
            // 예) 0시 13분 -> -1시 28분
            if (H < 0) {
                // 24시간을 더해준다
                // 예) -1시 28분 -> 23시 28분
                H += 24;
            }
        }

        System.out.println(H + " " + M);
    }

}
