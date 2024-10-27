package com.university.system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollment")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_id", insertable = false, updatable = false)
    private int studentId;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @Column(name = "course_department_id", insertable = false, updatable = false)
    private int courseDepartmentId;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private CourseDepartment courseDepartment;

    @Column(name = "grade")
    private String grade;

    public Enrollment() {
    }

    public Enrollment(int studentId, Student student, int courseDepartmentIdId, CourseDepartment courseDepartment, String grade) {
        this.studentId = studentId;
        this.student = student;
        this.courseDepartmentId = courseDepartmentId;
        this.courseDepartment = courseDepartment;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCourseDepartmentIdId() {
        return courseDepartmentId;
    }

    public void setCourseDepartmentId(int courseId) {
        this.courseDepartmentId = courseDepartmentId;
    }

    public CourseDepartment getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(CourseDepartment courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
