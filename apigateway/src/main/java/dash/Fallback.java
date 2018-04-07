package dash;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpResponse;
/**
 * Created by Dash on 4/7/2018.
 */
@Configuration
public class Fallback {

    @Bean
    public FallbackProvider zuulFallbackProvider() {
        return new FallbackProvider() {

            @Override
            public String getRoute() {
                return "*";
            }

            @Override
            public ClientHttpResponse fallbackResponse(String s, Throwable throwable) {
                System.out.println("Send Email");
                return null;
            }
        };
    }
}
