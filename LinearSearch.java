class LinearSearch {

    public static int SearchFun(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 50, 100, 80 };
        int key = 5;

        if (SearchFun(arr, key) != -1) {
            int pos = SearchFun(arr, key);
            System.out.println("Element is found in position of " + pos);
        } else {
            System.out.println("Element is not found");
        }

    }
}
