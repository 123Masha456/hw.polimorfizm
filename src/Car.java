public class Car extends Vechicle {
    public String modelName;
    public int wheelsCount;
    public String modelOfEngine;

    public Car(String modelName, int wheelsCount, String modelOfEngine) {
        super(modelName, wheelsCount);
        this.modelOfEngine = modelOfEngine;
    }

    public String getModelOfEngine() {
        return getModelOfEngine();
    }

    public void setModelOfEngine(String modelOfEngine) {
        this.modelOfEngine = modelOfEngine;
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service() {
        super.service();
        checkEngine();
    }
}
