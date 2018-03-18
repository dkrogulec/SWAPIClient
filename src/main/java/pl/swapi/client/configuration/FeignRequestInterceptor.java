package pl.swapi.client.configuration;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

/**
 * @author Daniel Krogulec
 */
@Component
public class FeignRequestInterceptor implements feign.RequestInterceptor {

    private final String APP_NAME;

    public FeignRequestInterceptor(@Value("${spring.application.name}") String appName) {
        this.APP_NAME = appName;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        Map<String, Collection<String>> headers = Maps.newHashMap();
        headers.put(HttpHeaders.USER_AGENT, Lists.newArrayList(APP_NAME));

        requestTemplate.headers(headers);
    }
}
