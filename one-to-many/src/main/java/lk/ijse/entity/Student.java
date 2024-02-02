package lk.ijse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "student")
    private List<Laptop> laptops;
}
