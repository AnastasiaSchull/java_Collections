package com.company.collections;

import java.util.*;

public class ListExample {
    private List<String> list1;
    private List<String> list2;
    private List<String> list3;
    
    public List<String> getList1() {
        return list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public List<String> getList3() {
        return list3;
    }

    public  void runListExample() {
        // cоздаем ArrayList<String> (list1)
         list1 = new ArrayList<>();

        // создаем массив строк. Добавим в список все элементы массива (одним методом)
        String[] array = {"Banana", "Apple", "Date", "Pear", "Cherry"};
        Collections.addAll(list1, array);
        System.out.println("list1: " + list1);

        // новый (list2) ArrayList<String>, проинициализируем его предыдущим списком
        list2 = new ArrayList<>(list1);
        System.out.println("list2: " + list2);

        // список (list3) используя Arrays.asList(…)
        list3 = Arrays.asList("Fig", "Grape", "Melon");
        System.out.println("list3: " + list3);

        // вставим list3 в середину list2
        int middleIndex = list2.size() / 2;
        list2.addAll(middleIndex, list3);
        System.out.println("list2 after adding list3 in the middle: " + list2);

        // сортируем по убыванию
        list2.sort(Collections.reverseOrder());
        System.out.println("list2 sorted in reverse order: " + list2);

        // удаляем каждый 2й элемент списка используя listiterator
        ListIterator<String> iterator = list2.listIterator();
        int index = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (index % 2 == 1) {
                iterator.remove();
            }
            index++;
        }
        System.out.println("list2 after removing every second element: " + list2);
    }
}
