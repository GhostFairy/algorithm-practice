// 2953. 나는 요리사다

public class Baekjoon2953 {

    public static void main(String[] args) {
        int[][] cook = new int[5][];

        /*
        cook[0] = new int[]{5, 4, 4, 5};
        cook[1] = new int[]{5, 4, 4, 4};
        cook[2] = new int[]{5, 5, 4, 4};
        cook[3] = new int[]{5, 5, 5, 4};
        cook[4] = new int[]{4, 4, 4, 5};
        */
        cook[0] = new int[]{4, 4, 3, 3};
        cook[1] = new int[]{5, 4, 3, 5};
        cook[2] = new int[]{5, 5, 2, 4};
        cook[3] = new int[]{5, 5, 5, 1};
        cook[4] = new int[]{4, 4, 4, 4};

        int topCook = 0;
        int topScore = 0;

        for (int i = 0; i < cook.length; i++) {
            int sum = 0;

            for (int j = 0; j < cook[i].length; j++) {
                sum += cook[i][j];
            }

            if (sum > topScore) {
                topCook = i + 1;
                topScore = sum;
            }
        }

        System.out.println("우승자: " + topCook + "번 참가자");
        System.out.println("점수: " + topScore);
    }

}
