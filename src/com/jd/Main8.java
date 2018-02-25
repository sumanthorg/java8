package com.jd;

import java.util.concurrent.CompletableFuture;

public class Main8 {
    public static void main(String[] args) throws Exception{
        CompletableFuture.supplyAsync(Main8::getInteger)
                .exceptionally(Main8::processError)
                .thenApply(data -> data * 2)
                .exceptionally(Main8::processError)
                .thenAccept(data -> printIt(data));
    }

    private static int processError(Throwable th) {
        System.out.println(th);
        //return 0;
        throw new RuntimeException("Again");
    }

    private static Integer getInteger() {
        Sleep.sleep(10);
        return 2;
    }

    private static void printIt(int value) {
        System.out.println(value);
    }
}
