package by.yudchits.uiip.crud_service.entity;

import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotBlank(message = "The field must be specified")
    @Length(min = 2, max = 25, message = "Size must be between 2 and 25 characters")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "The field must be specified")
    @Length(min = 2, max = 25, message = "Size must be between 2 and 25 characters")
    @Column(name = "surname")
    private String surname;

    @Digits(integer = 2,fraction = 2, message = "Number of digits in fractional part cannot be more than 1")
    @Min(value = 0, message = "An average grade cannot be less than 0")
    @Max(value = 10, message = "An average grade cannot be more than 10")
    @Column(name = "avg_grade")
    private double averageGrade;

    @Pattern(regexp = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$", message = "Invalid email address")
    @Column(name = "email")
    private String email;

    public Student() {
    }

    public Student(String name, String surname, double averageGrade, String email) {
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
