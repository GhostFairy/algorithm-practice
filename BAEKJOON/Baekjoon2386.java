// 2386. 도비의 영어 공부

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2386 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");
            if (input[0].equalsIgnoreCase("#")) {
                break;
            }

            int count = 0;
            for (int i = 1; i < input.length; i++) {
                for (int j = 0; j < input[i].length(); j++) {
                    if (input[i].substring(j, j + 1).equalsIgnoreCase(input[0])) {
                        count++;
                    }
                }
            }
            System.out.println(input[0] + " " + count);
        }
    }

}
