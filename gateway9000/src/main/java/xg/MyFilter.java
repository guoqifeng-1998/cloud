package xg;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Component//注意，必须添加这个注解
public class MyFilter implements GlobalFilter,Ordered {
public Mono<Void> filter(ServerWebExchange e, GatewayFilterChain chain) {
      System.out.println("进入gateway网关:"+new Date());
      String name=e.getRequest().getQueryParams().getFirst("username");
      if(name==null){
          System.out.println("-----非法用户-----");
          return e.getResponse().setComplete();//不放行
      }
      return chain.filter(e);//放行，进入下一个过滤器（如果有）
  }
  //决定过滤的顺序
  public int getOrder() {
      return 0;
  }
}