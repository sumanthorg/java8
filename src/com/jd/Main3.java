package com.jd;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class Main3 {
    public static void main(String[] args) {
        ForkJoinPool pool1 = new ForkJoinPool(10);
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Main3::getInteger, pool1);

        //Sleep.sleep(1);
        future.thenAccept(Main3::printIt);
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
