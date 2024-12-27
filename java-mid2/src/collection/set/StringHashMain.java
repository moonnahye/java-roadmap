package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        // 해시 코드
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('C') = " + hashCode("AB"));

        // 해시 인덱스
        System.out.println("hashIndex(A)) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B)) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(C)) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for(char c : charArray) {
            sum = sum + (int)c;
        }
        return sum;
    }

    static int hashIndex(int hashCode){
        return hashCode%CAPACITY;
    }
}
