package xg.config;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
//    @Bean//HttpClient
//    @LoadBalanced
//    public RestTemplate getTmp(){
//        return new RestTemplate();
//    }

    @Bean
    public IRule rule(){
//        return new RoundRobinRule();
        return new NacosRule();
//        return new RetryRule();
//        return new WeightedResponseTimeRule();
        //return new BestAvailableRule();
//        return new ReThreeRule();
    }
}