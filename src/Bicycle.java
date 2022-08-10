public class Bicycle implements General {
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
        System.out.println("Меняем покрышку у велосипеда.");
        System.out.println("Меняем покрышку у велосипеда.");

    }

    @Override
    public void checkGeneral() {
        System.out.println("Неисправностей не обнаруженно.");

    }
}


