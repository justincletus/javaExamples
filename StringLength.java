
import java.io.*;
import java.util.*;

class StringLength {

    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(s1.length());
        int len = s1.length();
        int count = 0;

        char a1[] = new char[len];

        for (int i = 0; i < len; i++) {
            a1[i] = s1.charAt(i);

        }

        System.out.println(Arrays.toString(a1));

        // System.out.println(a1);
        // System.out.println(s1.charAt(0));
    }
}
