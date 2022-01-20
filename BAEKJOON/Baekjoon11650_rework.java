// 11650. 좌표 정렬하기 (Comparator 사용)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon11650_rework {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        String[][] arr = new String[max][];

        for (int i = 0; i < max; i++) {
            arr[i] = br.readLine().split(" ");
        }

        Arrays.sort(arr, (left, right) -> {
            if (left[0].equals(right[0])) {
                // x좌표가 같으면 y좌표로 비교
                // 같으면 0, left가 크면 양수, right이 크면 음수 --> 뺄셈
                return Integer.parseInt(left[1]) - Integer.parseInt(right[1]);
            } else {
                // 같으면 0, left가 크면 양수, right이 크면 음수 --> 뺄셈
                return Integer.parseInt(left[0]) - Integer.parseInt(right[0]);
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

}