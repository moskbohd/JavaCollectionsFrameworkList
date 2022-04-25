package com.MoskBohd;


import java.awt.desktop.SystemEventListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        // array list
        // create list
        List<Integer> arrayList = new ArrayList<>();

        LocalDateTime startA = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(100));
        }
        LocalDateTime finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for inserting new data:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");

        // insert on the beginning, middle, end
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i, random.nextInt(100));
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for inserting data on the beginning:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");

        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add((int)arrayList.size()/2+i, random.nextInt(100));
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for inserting data on the middle:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(random.nextInt(100));
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for inserting data on the end:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");

        // updating on the beginning, middle, end
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(i, random.nextInt(100));
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for updating data on the beginning"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set((int)arrayList.size()/2+i, random.nextInt(100));
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for updating data on the middle:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set((int) arrayList.size()-1-i, random.nextInt(100));
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for updating data on the end:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");

        // deleting from the beginning, middle, end
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for deleting data on the beginning:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove((int)arrayList.size()/2+i);
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for deleting data on the middle:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");
        startA = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove((int)arrayList.size()-1-i);
        }
        finishA = LocalDateTime.now();
        System.out.println("ArrayList" + "Time for deleting data on the end:"
                + ChronoUnit.MILLIS.between(startA, finishA) + "ms");

        // linked list
        // create list
        List<Integer> linkedList = new LinkedList<>();

        LocalDateTime startL = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(100));
        }
        LocalDateTime finishL = LocalDateTime.now();
        System.out.println("\nLinkedList" + "Time for inserting data:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");

        // insert on the beginning, middle, end
        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i, random.nextInt(100));
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for inserting data on the beginning:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");
        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add((int)linkedList.size()/2+i, random.nextInt(100));
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for inserting data on the middle:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");
        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(random.nextInt(100));
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for inserting data on the end:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");

        // updating from the beginning, middle, end
        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(i, random.nextInt(100));
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for updating data on the beginning:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");
        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set((int)linkedList.size()/2+i, random.nextInt(100));
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for updating data on the middle:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");

        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set((int) arrayList.size()-1-i, random.nextInt(100));
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for inserting data on the end:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");

        // deleting from the beginning, middle, end
        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(i);
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for deleting data on the beginning:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");
        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove((int)linkedList.size()/2+i);
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for updating data on the middle:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");

        startL = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove((int) arrayList.size()-1-i);
        }
        finishL = LocalDateTime.now();
        System.out.println("LinkedList" + "Time for inserting data on the end:"
                + ChronoUnit.MILLIS.between(startL, finishL) + "ms");
    }
}
