package com.feign.sericefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 1.使用fallback
 * 2.使用fallbackFactory
 */
@FeignClient(value = "service-hi",fallback =SchedualServiceHiHystric.class,fallbackFactory = MyServiceFallBackFactory.class)//feign调用服务
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
