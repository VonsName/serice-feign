package com.feign.sericefeign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 熔断机制
 * @author Administrator
 */
@Component
public class MyServiceFallBackFactory implements FallbackFactory<SchedualServiceHi> {
    @Override
    public SchedualServiceHi create(Throwable throwable) {
        return new SchedualServiceHi() {
            @Override
            public String sayHiFromClientOne(String name) {
                return "链接失败";
            }
        };
    }
}
