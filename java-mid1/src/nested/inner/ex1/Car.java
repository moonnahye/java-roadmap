package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine에서만 사용 메서드
    public int getModel() {
        return chargeLevel;
    }

    // Engine에서만 사용 메서드
    public String getChargeLevel() {
        return model;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
