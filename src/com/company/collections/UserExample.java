package com.company.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserExample {
    public static void runUserExample() {
        // создаем userSet (HashSet<User>)
        Set<User> userSet = new HashSet<>();

        // создаем 2 экземпляра класса User с одинаковыми полями и 1 экземпляр отличающийся возрастом
        User user1 = new User("Anna", 25, "123-456-7890");
        User user2 = new User("Anna", 25, "123-456-7890");
        User user3 = new User("Anna", 30, "123-456-7890");

        // будем использовать только имя для хэш-кода
        User.useFullHashCode = false;
        // добавляем пользователей
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
       //Anna c возрастом 30 не добавляется в Set, потому что HashSet считает их одинаковыми из-за одинакового имени
        System.out.println("Users in userSet (with hashCode based only on name): " + userSet);

        // очищаем userSet для нового теста
        userSet.clear();

        //используем полный хэш-код
        User.useFullHashCode = true;

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        System.out.println("Users in userSet (with hashCode based on all fields): " + userSet);
    }
}

class User {
    private String name;
    private int age;
    private String phone;
    public static boolean useFullHashCode = true;//для хэш-кода

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        if (useFullHashCode) {
            //все поля для генерации хэш-кода
            return Objects.hash(name, age, phone);
        } else {
            //только name
            return Objects.hashCode(name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (useFullHashCode) {
            // сравниваем все поля, если используем полный хэш-код
            return age == user.age && Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
        } else {
            // сравниваем только имя, если используем сокращенный хэш-код
            return Objects.equals(name, user.name);
        }
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", phone='" + phone + "'}";
    }
}
