package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(100);

        System.out.println("new Integer: " + newInteger);
        System.out.println("integerObj: " + integerObj);
        System.out.println("longObj: " + longObj);
        System.out.println("doubleObj: " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue: " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue: " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + integerObj.equals(integerObj));

    }
}
