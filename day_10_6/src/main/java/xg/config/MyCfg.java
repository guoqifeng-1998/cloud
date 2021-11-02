package xg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xg.utils.MyIntor;
//@Configuration
public class MyCfg implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry r) {
        r.addInterceptor(new MyIntor()).addPathPatterns("/log").
                excludePathPatterns("/user/login","/login.html","/js/*");
    }
}
