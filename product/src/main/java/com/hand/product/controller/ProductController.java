package com.hand.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Licon
 * @description 生产者
 * @data 2019/7/17
 */
@RestController
public class ProductController {

    @Value("${server.servlet.application-display-name}")
    private String displayName;

    /**
     * 提供输出hello信息
     *
     * @param name 名字
     * @return "hello @name,this is producer service message!"
     */
    @RequestMapping("hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + ", this is " + displayName + " service message!";
    }
}
