package myconfig;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon自定义配置
 * @author yangqintao
 * @date 2019-09-08
 */
@Configuration
public class MyRibbonConfig2 {
    @Bean
    IRule getMyRule() {
        return new MyRoundRobinRule();
    }
}
