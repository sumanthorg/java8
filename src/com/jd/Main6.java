package com.jd;

import java.util.concurrent.CompletableFuture;

public class Main6 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = new CompletableFuture<>();
        future
            .thenApply(data -> data * 2) //is kinda map; performs transformation
            .thenAccept(data -> printIt(data)); //thenAccept is kinda forEach; might be not; but a terminal opn.
        //System.out.println(future.isCancelled());

        Sleep.sleep(2);
        //do some processing and let the outcome of the processing be 7
        future.complete(7);
    }

    private static Integer getInteger() {
        return 2;
    }

    private static void printIt(int value) {
        System.out.println(value);
    }
}
