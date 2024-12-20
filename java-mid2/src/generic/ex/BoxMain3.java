package generic.ex;

public class BoxMain3 {
    public static void main(String[] args) {
        // 생성시점에 T의 타입이 결정된다.
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        // integerBox.set("문자100"); Integer 타입만 허용, 컴파일 에러
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double double1 = doubleBox.get();
        System.out.println("double = " + double1);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
