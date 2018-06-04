package ru.levelup.lesson11;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int departmentId;



    @Column(unique = true, nullable = false, length = 50)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(unique = false)
    private City city;

    @OneToMany(mappedBy = "department", cascade = {
            //если однонаправленная связь то mappedBy =  не надо
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    //mappedBy будет искать по этому полю таблицу
    private Set<Employee> employees; // = new HashSet<>();

    public Department(){
        employees = new HashSet<>();
    }

//    @OneToMany(targetEntity = Employee.class)
//    private Set employees;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }


}
