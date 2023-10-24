package com.wlb.project.provider;

import java.util.concurrent.CompletableFuture;

/**
 * 服务示范类
 * @author wlb
 */
public interface DemoService {

    String sayHello(String name);

    String sayHello2(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }

}