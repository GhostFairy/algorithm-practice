// 10818. 최소, 최대
public class Baekjoon10818 {

    public static void main(String[] args) {
        int N = 5;
        int[] arr = {20, 10, 35, 30, 7};

        int max = -1000001;
        int min = 1000001;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }

}
