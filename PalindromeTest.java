class PalindromeTest {
    public static void main(String[] args) {
        String name = "mom";
        String reverse = "";

        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        if (name.contentEquals(reverse)) {
            System.out.println("Palindrome word");
        } else {
            System.out.println("not palindrome word");
        }

    }
}
