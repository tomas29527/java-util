package com.you.completableFuture;

import java.util.concurrent.CompletableFuture;

/**
 * <一句话说明功能>
 * <功能详细描述>
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2019/1/18 14:03
 * @since <版本号>
 */
public class CompletableFutureTest {

    public static void main(String[] args) {
        System.out.println("==main thread id ===:"+Thread.currentThread().getId() );
        //有返回值
        CompletableFuture.supplyAsync(()->{
            System.out.println("== supplyAsync thread id ===:"+Thread.currentThread().getId() );
            try {
                Thread.sleep(2000);
                int a=1/0;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello async return";
        }).whenComplete((r,n)->{
            System.out.println("== whenComplete thread id ===:"+Thread.currentThread().getId() );
            System.out.println(r);
            System.out.println(n);
        }).exceptionally((e)->{
           return e.getMessage();
        });

        //不需要返回值
        CompletableFuture.runAsync(()->{
            System.out.println("== runAsync thread id ===:"+Thread.currentThread().getId() );
        });

        //线程停止
        CompletableFuture completableFuture1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("== runAsync thread 1 ===:" + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "completa completableFuture1";
        });

        CompletableFuture completableFuture2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("== runAsync thread 2 ===:" + Thread.currentThread().getId());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "completa completableFuture2";
        });

        CompletableFuture completableFuture3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("== runAsync thread 3 ===:" + Thread.currentThread().getId());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "completa completableFuture3";
        });

//        CompletableFuture.anyOf(completableFuture1,completableFuture2,completableFuture3).whenComplete((r,a)->{
//            System.out.println("== complete ===:" + r);
//        });
        CompletableFuture.allOf(completableFuture1,completableFuture2,completableFuture3).whenComplete((r,a)->{
            System.out.println("== complete ===:" + r);
        });
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
