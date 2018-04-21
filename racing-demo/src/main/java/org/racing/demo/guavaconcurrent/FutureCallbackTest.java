package org.racing.demo.guavaconcurrent;

import com.google.common.base.Throwables;
import com.google.common.util.concurrent.*;

import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by dennis on 2016/4/28.
 */
public class FutureCallbackTest {
    public static void main(String[] args) {
        ListeningExecutorService listeningExecutorService = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        ListenableFuture<String> future = listeningExecutorService.submit(() -> {
            TimeUnit.SECONDS.sleep(10);
            return UUID.randomUUID().toString();
        });
        System.out.println("1111");
        Futures.addCallback(future, new FutureCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.println(result);
            }

            @Override
            public void onFailure(Throwable t) {
                Throwables.propagate(t);
            }
        });
        System.out.println("2222");
        listeningExecutorService.shutdown();
        System.out.println("3333");
    }
}
