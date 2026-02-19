package com.upgradadedthanyesterday.java.util.stream.filter.problem10;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindNonNullUniqueStrings {
    public static void main(String[] args) {
        // input list of strings
        List<String> list = Arrays.asList(
                "Java",
                " Spring ",
                null,
                "",
                "Microservices",
                "Java",                // duplicate
                "  Hibernate",
                "Docker  ",
                "  ",
                "Kubernetes",
                null,                  // duplicate null
                "AWS",
                " spring ",            // duplicate (case + spaces variation)
                "DevOps",
                "",
                "React",
                " Angular ",
                "SQL",
                "NoSQL",
                "Java  "               // duplicate with trailing space
        );

        // Applied filter to remove null, empty and duplicate strings, then pipelined terminal operation to print the value
        List<String> uniqueNonNullString = list.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s -> s.length()>5)
                .distinct()
                .sorted()
                .toList();

        System.out.println(uniqueNonNullString);
    }
}
