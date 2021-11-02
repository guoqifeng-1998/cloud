package xg;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

@Configuration
public class MyCfg {
    @Bean
    public IRule rule(){
        return new RandomRule();
    }
    @Test
    public void m(){
        System.out.println(ZonedDateTime.now());
    }
}
