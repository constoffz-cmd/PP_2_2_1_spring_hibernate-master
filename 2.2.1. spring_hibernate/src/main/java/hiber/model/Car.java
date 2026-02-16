package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Автоматическая генерация ID
    private Long id;

    @Column(name="model")
    private String model;

    @Column(name="series")
    private int series;

    public Car() {}

    public Car(String model, int series) {
        this.series = series;
        this.model = model;
    }

    public String getModel() {
        if (model == null) {
            return "";
        } else {
        return model;
        }
    }
    public int getSeries() {
        return series;
    }
}
