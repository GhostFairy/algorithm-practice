// 8958. OX퀴즈

public class Baekjoon8958 {

    public static void main(String[] args) {
        int N = 5;
        String[] arr = new String[N];
        arr[0] = "OOXXOXXOOO";
        arr[1] = "OOXXOOXXOO";
        arr[2] = "OXOXOXOXOXOXOX";
        arr[3] = "OOOOOOOOOO";
        arr[4] = "OOOOXOOOOXOOOOX";

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
