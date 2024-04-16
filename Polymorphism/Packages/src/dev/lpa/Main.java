package dev.lpa;

import com.abc.first.Item;

public class Main {
    public static void main(String[] args) {
//        Item firstItem = new Item("Burger");
        // another way to use package
//        com.abc.first.Item firstItem = new com.abc.first.Item("Burger");
        Item firstItem = new com.abc.first.Item("Burger");
        System.out.println(firstItem);
    }
}
