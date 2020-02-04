class PrimeNumber {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, m = 0, flag = 0;

        int n = 5;

        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");

        } else {
            for (int i = 2; i <= m; i++) {
                if (n % 2 != 0) {
                    System.out.println("n is prime number");
                } else {
                    System.out.println("n is prime number");
                }
            }

        }
    }
}
