package com.jd;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class Main5 {
    public static void main(String[] args) {

        CompletableFuture
                .supplyAsync(Main5::getInteger)
                .thenApply(data -> data * 2) //is kinda map; performs transformation
                .thenAccept(data -> printIt(data)); //thenAccept is kinda forEach; might be not; but a terminal opn.

    }

    private static Integer getInteger() {
        return 2;
    }

    private static void printIt(int value) {
        System.out.println(value);
    }
}
