public class Truck implements General{
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика.");
        System.out.println("Меняем покрышку у грузовика.");
        System.out.println("Меняем покрышку у грузовика.");
        System.out.println("Меняем покрышку у грузовика.");
        System.out.println("Меняем покрышку у грузовика.");
        System.out.println("Меняем покрышку у грузовика.");
        System.out.println("Меняем покрышку у грузовика.");
        System.out.println("Меняем покрышку у грузовика.");

    }

    @Override
    public void checkGeneral() {
        checkEngine();
        checkTrailer();
        System.out.println("Неисправностей не обнаруженно.");

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}

