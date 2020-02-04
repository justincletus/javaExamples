class BubbleSortMod {

    public static int[] BubbleTest(int arr[]) {
        int len = arr.length;
        int whlen = len;
        int j = 1;

        int newArr[] = new int[len];
        int n = len;
        int temp = 0;

        for (int i = 0; i < len; i++) {
            // newArr[i] = arr[i];
            // while (i > 0) {
            // temp = arr[i - 1];

            // if (temp > arr[i]) {
            // newArr[i] = temp;
            // arr[i - 1] = arr[i];

            // }
            // // temp = arr[i];

            // --i;
            // }

            for (j = 1; j < (len - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }
            }
            newArr[i] = arr[i];

        }

        return newArr;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 20, 50 };

        int arr2[] = BubbleTest(arr);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");

    }
}
