// 10809. 알파벳 찾기

public class Baekjoon10809 {

    public static void main(String[] args) {
        String word = "baekjoon";

        for (char i = 'a'; i <= 'z'; i++) {
            int index = -1;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == i) {
                    index = j;
                    break;
                }
            }

            System.out.print(index + " ");
        }

        System.out.println();
    }

}
