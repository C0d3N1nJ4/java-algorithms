package com.example.javaalgorithms.hash;

import java.util.HashMap;

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
    }
}

