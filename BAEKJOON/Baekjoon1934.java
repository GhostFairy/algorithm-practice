// 1934. 최소공배수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[][] input = new String[T][];
        for (int i = 0; i < T; i++) {
            input[i] = br.readLine().split(" ");
        }

        for (int i = 0; i < T; i++) {
            int A = Integer.parseInt(input[i][0]);
            int B = Integer.parseInt(input[i][1]);

            System.out.println(Math.abs(A * B) / gcd(A, B));
        }
    }

    static int gcd(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        }
        return gcd(b, r);
    }

}
