package dash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Dash on 4/6/2018.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableZuulProxy
public class ApiMain {
    public static void main(String... args) {
        SpringApplication.run(ApiMain.class, args);
    }
}
