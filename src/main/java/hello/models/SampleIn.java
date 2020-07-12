package hello.models;

public class SampleIn {
    private String fruitType;
    private Integer fruitCount;

    // required for deserialisation
    public SampleIn() {
    }

    public SampleIn(String fruitType, Integer fruitCount) {
        this.fruitType = fruitType;
        this.fruitCount = fruitCount;
    }

    public String getFruitType() {
        return fruitType;
    }

    public String getFruitTypePlural() {
        if (this.fruitCount != 1) {
            return this.fruitType + "s";
        }
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public Integer getFruitCount() {
        return fruitCount;
    }

    public void setFruitCount(Integer fruitCount) {
        this.fruitCount = fruitCount;
    }
}
