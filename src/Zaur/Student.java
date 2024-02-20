package Zaur;

import java.util.Objects;

public class Student implements Comparable <Student> {
    String name;
    String lastname;
    int course;

    public Student(String name, String lastname, int course) {
        this.name = name;
        this.lastname = lastname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", course=" + course;
    }

    @Override
    public int compareTo(Student another) {
        return this.course - another.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
