package com.autobots.java.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiLesson {

    public static void main(String[] args) {


        List<String> names = List.of("Anna", "Bob", "Allex", "Bella", "Andrew");

//        List<String> nameWithA = new ArrayList<>();
//        for (String name : names){
//           if(name.startsWith("A")){
//                nameWithA.add(name.toUpperCase());
//               Collections.sort(nameWithA);
//            }
//        }
//        System.out.println(nameWithA);

//        List<String> result = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .map(String :: toUpperCase)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(result);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int r1 = 0;
        for (int num : numbers) {
            r1 += num;
        }
        System.out.println(r1);

        int totalSum = numbers.stream()
                .mapToInt(num -> num)
                .sum();
        System.out.println(totalSum);

        int totalElements = (int) numbers.stream()
                .count();
        System.out.println(totalElements);

        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);

        List<String> list = List.of("one", "two", "three", "Helo", "four", "five");

        list.stream()
                .filter(s -> s.length() > 3)
                .findFirst()
                .ifPresent(System.out::println);

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



//        List<Employee> itEmployees = employees.stream()
//                .filter(s -> s.getDepartement().equalsIgnoreCase("IT"))
//                .collect(Collectors.toList());
//        System.out.println(itEmployees);
//        System.out.println("______");
//        employees.stream()
//                .filter(s -> s.getDepartement().equalsIgnoreCase("IT"))
//                .forEach(System.out::println);
//
//        List<Employee> itEmployees2 = new ArrayList<>();
//        for (Employee empl : employees) {
//            if (empl.getDepartement().equalsIgnoreCase("IT")) {
//                itEmployees2.add(empl);
//            }
//        }
//        System.out.println(itEmployees2);


//        Map<String, List<Employee>> employeesByDepartment = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartement));
//        System.out.println(employeesByDepartment);
//        employeesByDepartment.forEach((department, list1) -> {
//            System.out.println("Department: " + department);
//            list1.forEach(System.out::println);
//        });
//
//        System.out.println("____________-");
//        Map<String, List<Employee>> listByDepartment2 = new HashMap<>();
//
//        for (Employee employee : employees){
//            listByDepartment2.putIfAbsent(employee.getDepartement(), new ArrayList<>());
//            listByDepartment2.get(employee.getDepartement()).add(employee);
//        }
//
//        for (Map.Entry<String, List<Employee>> entry : listByDepartment2.entrySet()){
//            System.out.println(entry.getKey() + entry.getValue());
//        }
//        System.out.println(listByDepartment2);

    }
}
