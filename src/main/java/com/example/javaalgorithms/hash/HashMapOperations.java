package com.example.javaalgorithms.hash;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapOperations {

    public static void main(String[] args) {

        Employee employee = new Employee("John", 1, "IT");
        Employee employee2 = new Employee("Beyonce", 2, "Music");

        Employee employee3 = new Employee("Whitney", 3, "Marketing");

        HashMap<Integer, Employee> employeeMap = new HashMap<>();
            employeeMap.put(employee.id, employee);
            employeeMap.put(employee2.id, employee2);
            employeeMap.put(employee3.id, employee3);

        Employee retrievedEmployee = employeeMap.get(1);

            if (retrievedEmployee != null) {
            System.out.println(retrievedEmployee.name + " : " + retrievedEmployee.department);
        }

        HashSet<String> productCodes = new HashSet<>();
            productCodes.add("123");
            productCodes.add("456");
            productCodes.add("789");

            System.out.println(productCodes.contains("123"));
            System.out.println(productCodes.contains("999"));
    }
}

