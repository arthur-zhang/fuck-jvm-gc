package com.example.demo1;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created By Arthur Zhang at 2022/2/15
 */
public class ConfigService {
    private static List<String> namespaces = new LinkedList<>();

    static class Config {
    }

    public static Config getConfig2(String namespace) {
        namespaces.add(namespace);
        return new Config();
    }
    public static void getConfig(String namespace) {
        namespaces.add(namespace);
    }
    public static int getSize() {
        return namespaces.size();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < 10 * 10000; i++) {
            getConfig("user");
            if (i%10000==0){
                TimeUnit.SECONDS.sleep(1);;
            }
        }
        System.in.read();
    }
}
