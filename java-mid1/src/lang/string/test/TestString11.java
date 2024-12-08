package lang.string.test;

import lang.string.builder.StringBuilderMain1_1;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
