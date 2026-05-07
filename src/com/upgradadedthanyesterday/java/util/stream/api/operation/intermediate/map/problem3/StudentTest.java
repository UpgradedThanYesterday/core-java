package com.upgradadedthanyesterday.java.util.stream.api.operation.intermediate.map.problem3;

import java.util.List;
import java.util.stream.Stream;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(List.of("s1A", "s1B", "s1C", "s1D", "s1E", "s1F"));
        Student s2 = new Student(List.of("s2A", "s2B", "s2C", "s2D", "s1E", "s1F"));
        Student s3 = new Student(List.of("s2A", "s2B", "s2C", "s2D", "s3E", "s3F"));
        List<Student> students = List.of(s1, s2, s3);

        students.stream().map(Student::getSubjects).forEach(System.out::println);

        List<String> res = students.stream().flatMap(s->s.getSubjects().stream()).distinct().toList();
        System.out.println(res);

        List<List<String>> list = List.of(
                List.of("a", "b"),
                List.of("c", "d")
        );

        List<Stream<String>> kk = list.stream()
                .map(l -> l.stream())
                .toList();
    }
}
class Student {
    List<String> subjects;

    public Student(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}

