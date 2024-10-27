package com.university.system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course_faculty")
public class CourseDepartmentFaculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "course_department_id", insertable = false, updatable = false)
    private int courseDepartmentId;

    @ManyToOne
    @JoinColumn(name = "course_department_id", referencedColumnName = "id")
    private CourseDepartment courseDepartment;

    @Column(name = "faculty_id", insertable = false, updatable = false)
    private int facultyId;

    @ManyToOne
    @JoinColumn(name = "faculty_id", referencedColumnName = "id")
    private Faculty faculty;

    public CourseDepartmentFaculty() {
    }

    public CourseDepartmentFaculty(int courseDepartmentId, CourseDepartment courseDepartment, int facultyId, Faculty faculty) {
        this.courseDepartmentId = courseDepartmentId;
        this.courseDepartment = courseDepartment;
        this.facultyId = facultyId;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseDepartmentId() {
        return courseDepartmentId;
    }

    public void setCourseDepartmentId(int courseId) {
        this.courseDepartmentId = courseId;
    }

    public CourseDepartment getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(CourseDepartment courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
