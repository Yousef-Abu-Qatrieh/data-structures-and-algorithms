/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        int[] arr = new int[]{38, 27, 43, 3, 9, 82, 10};
        System.out.println("unsorted array");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int middle, int end) {

        // create a temporary  array
        int temp[] = new int[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = middle + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k += 1;
                i += 1;
            } else {
                temp[k] = arr[j];
                k += 1;
                j += 1;
            }
        }

        // add elements left in the first interval
        while (i <= middle) {
            temp[k] = arr[i];
            k += 1;
            i += 1;
        }

        // add elements left in the second interval
        while (j <= end) {
            temp[k] = arr[j];
            k += 1;
            j += 1;
        }

        // copy temp to original interval
        for (i = start; i <= end; i += 1) {
            arr[i] = temp[i - start];
        }
    }


}

