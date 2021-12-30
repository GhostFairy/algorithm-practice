// 매개변수로 받은 두 정수형 배열의 내용을 결합하여 하나의 배열로 리턴하는
// mergeArray() 메서드를 구현하시오.

class MergeTool {

    int[] mergeArray(int[] intArray1, int[] intArray2) {
        int[] mArray = new int[intArray1.length + intArray2.length];

        for (int i = 0; i < intArray1.length; i++) {
            mArray[i] = intArray1[i];
        }
        for (int i = 0; i < intArray2.length; i++) {
            mArray[intArray1.length + i] = intArray2[i];
        }

        return mArray;
    }

}

public class Prob001_method {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30};
        MergeTool m = new MergeTool();
        int[] arrm = m.mergeArray(arr1, arr2);

        System.out.println("합쳐진 배열:");
        for (int i = 0; i < arrm.length; i++) {
            System.out.print("[" + arrm[i] + "]");
        }
        System.out.println();
    }

}
