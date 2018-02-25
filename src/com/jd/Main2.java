package com.jd;

import java.util.concurrent.CompletableFuture;

public class Main2 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Main2::getInteger);

        Sleep.sleep(1);
        future.thenAccept(Main2::printIt);
        Sleep.sleep(1);

        System.out.println("in main");
    }

    private static Integer getInteger() {
        System.out.println("in completable future " + Thread.currentThread());
        return 2;
    }

    private static void printIt(int value) {
        System.out.println(value + " " + Thread.currentThread());
    }
}
