package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {


    @Id  // ВОТ ЭТОГО НЕ ХВАТАЕТ
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Автоматическая генерация ID
    private Long id;

    @Column(name="model")
    private String model;

    @Column(name="series")
    private int series;
}
