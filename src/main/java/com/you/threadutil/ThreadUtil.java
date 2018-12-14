package com.you.threadutil;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *       自定义线程池
 *
 * @author HX
 * @title <一句话说明功能>
 * @date 2018/12/14 17:39
 * @since <版本号>
 */
public class ThreadUtil {

    public  final static ExecutorService pool = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<Runnable>(1), new NamedThreadFactory("my-thread-util"),
            new ThreadPoolExecutor.DiscardOldestPolicy());



}
