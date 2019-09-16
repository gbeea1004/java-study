package sort.insert;

public class InsertSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertNo = arr[i];
            int insertIndex = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > insertNo) {
                    arr[j + 1] = arr[j]; // 한 칸 뒤로 밀기
                    insertIndex = j;
                } else {
                    break; // 정렬 끝
                }
            }
            arr[insertIndex] = insertNo;
        }
    }
}
