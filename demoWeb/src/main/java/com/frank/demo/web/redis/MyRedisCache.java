package com.frank.demo.web.redis;

import org.springframework.cache.Cache;
import java.util.concurrent.Callable;

public class MyRedisCache implements Cache {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Object getNativeCache() {
        return null;
    }

    @Override
    public ValueWrapper get(Object o) {
        return null;
    }

    @Override
    public <T> T get(Object o, Class<T> aClass) {
        return null;
    }

    @Override
    public <T> T get(Object o, Callable<T> callable) {
        return null;
    }

    @Override
    public void put(Object o, Object o1) {

    }

    @Override
    public ValueWrapper putIfAbsent(Object o, Object o1) {
        return null;
    }

    @Override
    public void evict(Object o) {

    }

    @Override
    public void clear() {

    }
}
