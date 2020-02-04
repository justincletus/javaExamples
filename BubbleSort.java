class BubbleSort {
    public static int[] BubbleSorted(int arr[]) {
        int len = arr.length;
        int temp = 0;

        int newArr[] = new int[len];

        for (int i = 0; i < len; i++) {
            // temp = arr[i];
            for (int j = 1; j < len - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                // if (temp > arr[j]) {
                // arr[j] = temp;
                // }
                // newArr[i] = arr[j];
            }

        }

        newArr = arr;

        return newArr;

    }

    public static void main(String[] args) {
        int arr[] = { 23, 5, 8, 1, 4 };

        int stdArr[] = BubbleSorted(arr);

        for (int i = 0; i < stdArr.length; i++) {
            System.out.print(stdArr[i] + " ");
        }

    }
}
