package com.jd;

import java.util.concurrent.CompletableFuture;

public class Main7 {
    public static void main(String[] args) throws Exception{
        CompletableFuture.supplyAsync(Main7::getInteger)
                .exceptionally(Main7::processError)
                .thenApply(data -> data * 2)
                .exceptionally(Main7::processError)
                .thenAccept(data -> printIt(data));
    }

    private static int processError(Throwable th) {
        System.out.println(th);
        //return 0;
        throw new RuntimeException("Again");
    }

    private static Integer getInteger() {
        //return 2;
        throw new RuntimeException("oops something went wrong");
    }

    private static void printIt(int value) {
        System.out.println(value);
    }
}
