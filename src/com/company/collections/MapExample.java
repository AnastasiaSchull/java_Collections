package com.company.collections;

import java.util.*;

public class MapExample {
    public static void runMapExample() {
        // создаем LinkedHashMap<Integer, String> (map1)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // добавляем в map значения всех месяцев года (номер месяца : название)
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");

        // выводим на экран первый и последний месяц года (0 и 11)
        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        // вставляем на место 6-го месяца слово ‘ОТПУСК’, вывести на экран
        map1.put(6, "ОТПУСК");
        System.out.println("Map after updating the 6th month: " + map1);

        // создаем HashMap<Integer, String> (map2)
        HashMap<Integer, String> map2 = new HashMap<>();

        // вставим в map2 все значения map1
        map2.putAll(map1);

//        map2.put(100, "Element 100");
//        map2.put(3, "Element 3");
//        map2.put(50, "Element 50");

        // выводим все элементы map1 и map2
        System.out.println("\n--- Elements of map1 (LinkedHashMap) ---");
        printMap(map1);

        System.out.println("\n--- Elements of map2 (HashMap) ---");
        printMap(map2);

        System.out.println();
        // создаем map3 (ключ – имя студента, значение - Set<String> контактов)
        HashMap<String, Set<String>> map3 = new HashMap<>();

        // добавляем данные для первого студента
        Set<String> student1Contacts = new HashSet<>();
        student1Contacts.add("123-456-7890");
        student1Contacts.add("student1@mail.com");
        student1Contacts.add("student1Skype");

        // добавляем данные для второго студента
        Set<String> student2Contacts = new HashSet<>();
        student2Contacts.add("987-654-3210");
        student2Contacts.add("student2@mail.com");
        student2Contacts.add("student2Skype");

        // добавляем студентов в map3
        map3.put("Anna Brown", student1Contacts);
        map3.put("Jane Smith", student2Contacts);

        // выводим на экран элементы map3
        System.out.println("map3 (student contacts):");
        printStudentMap(map3);
    }

    //для вывода эл-в map1 и map2 (номер месяца : название)
    public static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // для вывода эл-в map3 (ключ - студент, значение - контакты)
    public static void printStudentMap(Map<String, Set<String>> map) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Contacts: " + entry.getValue());
        }
    }
}
