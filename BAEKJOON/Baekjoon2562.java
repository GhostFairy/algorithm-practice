// 2562. 최댓값

public class Baekjoon2562 {

    public static void main(String[] args) {
        int max = 0;
        int order = 0;
        int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                order = i + 1;
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("위치: " + order + "번째");
    }

}
