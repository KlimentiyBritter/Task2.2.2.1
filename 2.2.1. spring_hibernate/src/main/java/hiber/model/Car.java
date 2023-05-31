package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String model;
    @Column(name = "series")
    private int series;
//    @OneToOne(mappedBy = "car")
//    private User user;
    public Car(){}
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car {" +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}