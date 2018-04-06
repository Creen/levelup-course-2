package ru.levelup.lesson07;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @Column(name = "D_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_name", unique = true, nullable = false)
    private String name;

    @Column(name = "city", nullable = false)
    private String city;

    @OneToOne(mappedBy = "department")
    private DepartmentInfo info;

    public Department(){}

    public Department(String name, String city){
        this.name = name;
        this.city = city;
    }

    public DepartmentInfo getInfo() {
        return info;
    }

    public void setInfo(DepartmentInfo info) {
        this.info = info;
    }
}
