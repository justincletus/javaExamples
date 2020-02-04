
// import java.io.*;
import java.util.*;
// import java.lang.*;

class ArrayExample {
    public static int[] addX(int arr[], int x) {
        int n = arr.length;
        int newArr[] = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = x;
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int x = 10;

        arr = addX(arr, x);

        System.out.println(Arrays.toString(arr));

    }
}
