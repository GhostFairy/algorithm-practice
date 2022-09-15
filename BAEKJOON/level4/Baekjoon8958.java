package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8958. OX퀴즈
public class Baekjoon8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;
            int score = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }

            System.out.println(sum);
        }
    }

}
