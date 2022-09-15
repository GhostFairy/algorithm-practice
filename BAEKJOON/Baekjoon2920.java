// 2920. 음계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[temp.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        int flag = 0; // 0 = mixed, 1 = ascending, -1 = descending

        if (arr[0] == 1) {
            flag = 1;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] + 1 != arr[i + 1]) {
                    flag = 0;
                    break;
                }
            }
        } else if (arr[0] == 8) {
            flag = -1;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] - 1 != arr[i + 1]) {
                    flag = 0;
                    break;
                }
            }
        }

        if (flag == 1) {
            System.out.println("ascending");
        } else if (flag == -1) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }

}
