// 2884. 알람 시계

public class Baekjoon2884 {

    public static void main(String[] args) {
        // 0 <= H <= 23, 0 <= M <= 59
        int H = (int) (Math.random() * 24);
        int M = (int) (Math.random() * 60);
        System.out.println(H + " " + M);

        // M을 45분 전으로 설정
        M -= 45;

        // 위의 연산으로 인해 M이 음수가 되었을 경우
        // 예) 15시 1분 -> 15시 -44분
        if (M < 0) {
            // 1시간을 줄이고 60분을 더해준다
            // 예) 15시 -44분 -> 14시 16분
            H--;
            M += 60;

            // 위의 연산으로 인해 H가 음수가 되었을 경우
            // 예) 0시 13분 -> -1시 28분
            if (H < 0) {
                // 24시간을 더해준다
                // 예) -1시 28분 -> 23시 28분
                H += 24;
            }
        }

        System.out.println(H + " " + M);
    }

}
