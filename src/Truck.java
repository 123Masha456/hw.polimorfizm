public class Truck extends Car {
    public String modelName;
    public int wheelsCount;
    public String modelOfEngine;
    public String modelOfTrailer;

    public Truck(String modelName, int wheelsCount, String modelOfEngine, String modelOfTrailer) {
        super(modelName, wheelsCount, modelOfEngine);
        this.modelOfTrailer = modelOfTrailer;
    }

    public String getModelOfTrailer() {
        return getModelOfTrailer();
    }

    public void setModelOfTrailer(String modelOfTrailer) {
        this.modelOfTrailer = modelOfTrailer;
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service() {
        super.service();
        checkTrailer();
    }
}

