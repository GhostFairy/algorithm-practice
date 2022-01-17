// 3003. 킹, 퀸, 룩, 비숍, 나이트, 폰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - Integer.parseInt(input[i]) + " ");
        }
        System.out.println();
    }

}