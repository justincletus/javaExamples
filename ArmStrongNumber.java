class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 152;
        int num3 = num;

        int val = 0;

        int len = String.valueOf(num).length();

        int arr[] = new int[len];

        int total = 1;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            val = num % 10;
            int num2 = len;
            while (num2 > 0) {
                total = total * val;
                --num2;
            }
            sum = sum + total;
            total = 1;
            // arr[i] = val;
            num = num / 10;

        }
        if (sum == num3) {
            System.out.println(num3 + " is Armstrong number");
        } else {
            System.out.println(num3 + " is not Armstrong number");
        }

        System.out.println(sum);
    }
}
