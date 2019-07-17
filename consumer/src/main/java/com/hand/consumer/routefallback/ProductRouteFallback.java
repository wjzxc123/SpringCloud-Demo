package com.hand.consumer.routefallback;


import com.hand.consumer.route.ProductRoute;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Licon
 * @description 熔断器回调
 * @data 2019/7/17
 */
@Component
public class ProductRouteFallback implements ProductRoute {


    /**
     * 远程调用失败，将会回调该方法
     * @param name 名称
     * @return 自定义返回信息
     */
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message is failed";
    }
}
