package sort;

public class SelectionSort {
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                T temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }
}
