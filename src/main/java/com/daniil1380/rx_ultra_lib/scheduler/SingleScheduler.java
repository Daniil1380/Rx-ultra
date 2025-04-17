package com.daniil1380.rx_ultra_lib.scheduler;

import com.daniil1380.rx_ultra_lib.interfaces.Scheduler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleScheduler implements Scheduler {
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override
    public void execute(Runnable task) {
        executor.submit(task);
    }
}
