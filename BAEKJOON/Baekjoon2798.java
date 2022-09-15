import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2798. 블랙잭
public class Baekjoon2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lineF = br.readLine().split(" ");
        int N = Integer.parseInt(lineF[0]);
        int M = Integer.parseInt(lineF[1]);

        String[] temp = br.readLine().split(" ");
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(temp[i]);
        }

        int approach = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= M && sum > approach) {
                        approach = sum;
                    }
                }
            }
        }

        System.out.println(approach);
    }

}
