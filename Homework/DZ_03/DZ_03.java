//+Реализовать алгоритм сортировки слиянием

package DZ_03;

public class DZ_03 {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 7, 2, 3, 1, 6, 2, 101, 55, 9 };
        int len = arr.length;
        mergeSort(arr, len);
        printArray(arr);
    }

    // Рекурсивная функция разделения на подмассивы и сортировки
    public static void mergeSort(int[] array, int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < len; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, len - mid);

        comparison(array, left, right, mid, len - mid);
    }

    // Функция сравнения и сортировки
    public static void comparison(
            int[] array, int[] left, int[] right, int leftpart, int rightpart) {

        int i = 0, j = 0, k = 0;
        while (i < leftpart && j < rightpart) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < leftpart) {
            array[k++] = left[i++];
        }
        while (j < rightpart) {
            array[k++] = right[j++];
        }
    }

    // Вывод массива
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
    }

}