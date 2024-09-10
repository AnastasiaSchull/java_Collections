package com.company;
import com.company.collections.ListExample;
import com.company.collections.MapExample;
import com.company.collections.SetExample;
import com.company.collections.UserExample;

public class Main {
    public static void main(String[] args) {
        //пример с List
        System.out.println("---- List Example ----");
        ListExample listExample = new ListExample();
        listExample.runListExample();
        System.out.println();
        //пример с Set
        System.out.println("---- Set Example ----");
        SetExample setExample = new SetExample();
        setExample.runSetExample(listExample.getList1(), listExample.getList2(), listExample.getList3());
        System.out.println();
        //пример с Map
        System.out.println("\n---- Map Example ----");
        MapExample.runMapExample();
        System.out.println();
        //пример с User
        System.out.println("\n---- User Example ----");
        UserExample.runUserExample();


    }
}