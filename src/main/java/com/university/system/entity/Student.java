package com.university.system.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "dept_id", insertable = false, updatable = false)  // Read-only version
    private int deptId;

    // IMPORTANT -
//    When you query a Student object, the deptId field will automatically be populated with the value of
//    the dept_id column from the database. However, if you change the deptId in the Student object,
//    it won’t be reflected in the database unless you modify the Department relationship directly.

    @ManyToOne
    @JoinColumn(name="dept_id", referencedColumnName = "id")
    private Department department;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, int deptId, Department department)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deptId = deptId;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
