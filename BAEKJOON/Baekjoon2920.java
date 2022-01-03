// 2920. 음계

public class Baekjoon2920 {

    public static void main(String[] args) {
        int[][] arr = new int[3][8];
        arr[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        arr[1] = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        arr[2] = new int[]{8, 1, 7, 2, 6, 3, 5, 4};

        for (int i = 0; i < arr.length; i++) {
            int flag = 0; // 0 = mixed, 1 = ascending, -1 = descending

            if (arr[i][0] == 1) {
                flag = 1;

                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] + 1 != arr[i][j + 1]) {
                        flag = 0;
                        break;
                    }
                }
            } else if (arr[i][0] == 8) {
                flag = -1;

                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] - 1 != arr[i][j + 1]) {
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

}
