// 2869. 달팽이는 올라가고 싶다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        // V <= count * A - (count - 1) * B
        // V - B <= count(A - B)
        // (V - B) / (A - B) <= count

        System.out.println((int) Math.ceil((double) (V - B) / (A - B)));
    }

}
