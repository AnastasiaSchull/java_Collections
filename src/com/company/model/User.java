package com.company.model;

import java.util.Objects;

public class User {
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
