package algorithms.sorts.bubblesort;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + i]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
