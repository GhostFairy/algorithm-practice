// data배열의 요소가 '_'이면 ' '으로 변경후 리턴하는
// 프로그램을 구현하시오.

class ChangeTool {

    char[] changeArray(char[] charArray) {
        char[] cArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '_') {
                cArray[i] = ' ';
            } else {
                cArray[i] = charArray[i];
            }
        }

        return cArray;
    }

}

public class Prob003_method {

    public static void main(String[] args) {
        ChangeTool c = new ChangeTool();

        char[] arr1 = {'j', 'a', 'v', 'a', '_', 'j', 's', 'p'};
        System.out.print("원래 배열: ");
        System.out.println(arr1);
        System.out.print("변환 배열: ");
        System.out.println(c.changeArray(arr1));

        System.out.println();

        char[] arr2 = {'s', 'e', 'o', 'u', 'l', '_', 'i', 'n', 'c', 'h', 'o', 'n'};
        System.out.print("원래 배열: ");
        System.out.println(arr2);
        System.out.print("변환 배열: ");
        System.out.println(c.changeArray(arr2));
    }

}
