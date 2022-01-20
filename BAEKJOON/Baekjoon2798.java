// 2798. 블랙잭

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon2798 {

    public static void main(String[] args) throws IOException {
        // 데이터 입력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        int[] card = new int[num];
        for (int i = 0; i < num; i++) {
            card[i] = sc.nextInt();
        }
        sc.close();

        int approach = 0;
        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    int sum = card[i] + card[j] + card[k];
                    // 목표값에 가장 근접한 값 = 목표값보다 작거나 같은 값 중 가장 큰 값
                    if (sum <= target && sum > approach) {
                        approach = sum;
                    }
                }
            }
        }

        System.out.println(approach);
    }

}
