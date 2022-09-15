import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1546. 평균
public class Baekjoon1546 {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");

        int M = 0;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int score = Integer.parseInt(scores[i]);
            if (score > M) {
                M = score;
            }
            sum += score;
        }
        // 출력
        System.out.println((double) sum / M * 100 / num);
    }

}
