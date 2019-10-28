package com.huizhi.supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.huizhi.supplier")
//@ComponentScan(basePackages = "com.huizhi.supplier")
public class SupplierApplication {
    public static void main(String[] args) {
        SpringApplication.run(SupplierApplication.class, args);
    }
}
