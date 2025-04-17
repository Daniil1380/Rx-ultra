package com.daniil1380.rx_ultra_lib.interfaces;

public interface Observer<T> {
    void onNext(T item);
    void onError(Throwable t);
    void onComplete();
}