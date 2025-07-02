package com.autobots.java.streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindSalary {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Alice", 28, 3000, "IT"),
                new Employee(2, "Bob", 35, 4000, "HR"),
                new Employee(3, "Charlie", 40, 5000, "Finance"),
                new Employee(4, "David", 25, 3500, "IT"),
                new Employee(5, "Eva", 30, 4200, "Marketing"),
                new Employee(6, "Frank", 45, 6000, "Finance"),
                new Employee(7, "Grace", 32, 4100, "HR"),
                new Employee(8, "Henry", 29, 3900, "IT"),
                new Employee(9, "Isabel", 38, 4500, "Marketing"),
                new Employee(10, "Jack", 27, 3600, "IT")
        );

        Map<String, Double> averageSalaryByDep = new HashMap<>();
        Map<String, Integer> averageByDep = new HashMap<>();

        int count = 0;
        for (Employee employee : employees) {
            averageSalaryByDep.putIfAbsent(employee.getDepartement(),
                    averageSalaryByDep.getOrDefault(employee.getDepartement(), 0.0)
                            + employee.getSalary());

            averageByDep.put(employee.getDepartement(),
                    averageByDep.getOrDefault(employee.getDepartement(), 0) + 1);
        }
        double averageSal = 0.0;

        for (String dep : averageSalaryByDep.keySet()) {
            averageSal = averageSalaryByDep.get(dep) / averageByDep.get(dep);
            System.out.printf("%s -> $%.2f%n", dep, averageSal);
        }

        Map<String, Double> averageSalaryByDepWithStream = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartement,
                        Collectors.averagingDouble(Employee::getSalary)));
                                             // тут мы сами задали переменные под тип нашего мапа
        averageSalaryByDepWithStream.forEach((dep, averageSalary) -> System.out.println("Department: "
                + dep + " -> average salary: $" + averageSalary));



    }


}
