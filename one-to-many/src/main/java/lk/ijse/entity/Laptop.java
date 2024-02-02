package lk.ijse.entity;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    private String id;
    private String brand;
    private String model;
    @ManyToOne
    private Student student;
}
