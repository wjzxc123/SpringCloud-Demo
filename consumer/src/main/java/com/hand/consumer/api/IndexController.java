package com.hand.consumer.api;

import com.hand.consumer.route.ProductRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Licon
 * @description 检索资源
 * @data 2019/7/17
 */
@RestController
public class IndexController {

    @Autowired
    ProductRoute productRoute;

    /**
     * 输出hello方法
     * @param name 名称
     * @return 远程调用返回值
     */
    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
        return productRoute.hello(name);
    }
}
