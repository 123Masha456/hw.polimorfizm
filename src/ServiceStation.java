public class ServiceStation {
    public void check(Vechicle vechicle) {
        if (vechicle != null) {
            System.out.println("Обслуживаем " + vechicle.getModelName());
            vechicle.service();
        }
    }
}

