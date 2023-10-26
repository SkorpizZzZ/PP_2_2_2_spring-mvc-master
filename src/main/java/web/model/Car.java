package web.model;

public class Car {

    private String model;
    private Integer series;
    private Integer year;

    public Car(String model, Integer series, Integer year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", year=" + year +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public Integer getSeries() {
        return series;
    }

    public Integer getYear() {
        return year;
    }
}
