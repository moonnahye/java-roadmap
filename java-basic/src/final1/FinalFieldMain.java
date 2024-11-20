package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        ConstrunctInit construnctInit1 = new ConstrunctInit(10);
        ConstrunctInit construnctInit2 = new ConstrunctInit(20);
        System.out.println(construnctInit1.value);
        System.out.println(construnctInit2.value);

        // final 필드 - 필드 초기화
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println(FieldInit.CONST_VALUE);
    }
}
