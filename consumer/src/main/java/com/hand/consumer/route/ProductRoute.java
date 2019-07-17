package com.hand.consumer.route;

import com.hand.consumer.routefallback.ProductRouteFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**使用 Fegin调用服务
 * @author Licon
 * @description 生产者调用
 * @data 2019/7/17
 */
@FeignClient(name = "product-server",fallback = ProductRouteFallback.class)
public interface ProductRoute {
    /**远程调用
     * @Author Licon
     * @Description //TODO Licon
     * @Date 10:28 2019/7/17
     * @Param [name]
     * @return java.lang.String
     **/
    @RequestMapping(value="/hello")
    String  hello(@RequestParam(value = "name") String name);
}
