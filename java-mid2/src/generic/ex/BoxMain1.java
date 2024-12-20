package generic.ex;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // 오토 박식
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);
    }
}
