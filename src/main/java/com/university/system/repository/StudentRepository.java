package com.university.system.repository;

import com.university.system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
// nativeQuery = true
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT e.student, s.firstName, s.lastName, d.name, c.name, e.grade " +
            "FROM Enrollment e " +
            "JOIN CourseDepartment cd ON cd.id = e.courseDepartmentId " +
            "JOIN Course c ON c.id = cd.courseId " +
            "JOIN Student s ON s.id = e.studentId " +
            "JOIN Department d ON d.id = s.deptId " +
            "WHERE c.name = :courseName " +
            "ORDER BY d.name, e.grade DESC")
    List<Object[]> findTopStudentsByCourseName(@Param("courseName") String courseName);

}
