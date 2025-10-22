package com.xworks.metro.internal;

public class Author {
    public String authorName;
    public int age;

    public Author(String authorName, int age) {
        this.authorName = authorName;
        this.age = age;
    }

    public void displayAuthor() {
        System.out.println("This is Author class");
        System.out.println("Author name: " + authorName);
        System.out.println("Author age: " + age);
    }
}
