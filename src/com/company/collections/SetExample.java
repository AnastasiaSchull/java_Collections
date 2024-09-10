package com.company.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public void runSetExample(List<String> list1, List<String> list2, List<String> list3) {
        //создаем HashSet<String> (set1)
        Set<String> set1 = new HashSet<>();
        // вставляем в set 2 произвольные строки
        set1.add("Hello");
        set1.add("World");
        System.out.println("set1: " + set1);

        // вставляем в set все элементы из list1 и list2
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println("set1 after adding elements from list1 and list2: " + set1);

        // создаем LinkedHashSet<String> (set2)
        Set<String> set2 = new LinkedHashSet<>();

        // вставляем в set все элементы из list2 и list3
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println("set2 after adding elements from list2 and list3: " + set2);

        // выводим на экран значения set-a
        System.out.println("set2 (order preserved!): " + set2);
    }
}
