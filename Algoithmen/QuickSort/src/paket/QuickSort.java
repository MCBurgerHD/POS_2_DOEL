package paket;

/**
 * Created: 3.12.2021
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class QuickSort {

    public static int[] intArr = { 15, 20, 30, 23, 7, 26, 29, 14, 24, 18, 13, 2, 9, 6, 11, 10, 22, 21, 4, 25, 19, 12, 1, 5, 27, 3, 17, 16, 8, 28};

    public int[] sort(int l, int r) {
        int q;
        if (l < r) {
            q = partition(l, r);
            sort(l, q);
            sort(q + 1, r);
        }
        return intArr;
    }

    int partition(int l, int r) {

        int i, j, x = intArr[(l + r) / 2];
        i = l - 1;
        j = r + 1;
        while (true) {
            do {
                i++;
            } while (intArr[i] < x);

            do {
                j--;
            } while (intArr[j] > x);

            if (i < j) {
                int k = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = k;
            } else {
                return j;
            }
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = qs.sort(0, intArr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}