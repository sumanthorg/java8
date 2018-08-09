package com.jd;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Main::getInteger);

        Sleep.sleep(1);
        System.out.println(
                future.getNow(1)
        );
        System.out.println("in main");
    }

    private static Integer getInteger() {
        System.out.println("in completable future");
        //Sleep.sleep(2);
        return 3;
    }
}
