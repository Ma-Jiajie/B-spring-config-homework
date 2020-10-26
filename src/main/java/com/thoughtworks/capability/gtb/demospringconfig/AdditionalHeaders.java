package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties("mail")
public class AdditionalHeaders {
    private Map<String, String> additionalHeaders = new HashMap<>();

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    @Override
    public String toString() {
        StringBuilder stringAdditionalHeaders = new StringBuilder("");

        for (String key : additionalHeaders.keySet()) {
            String value = additionalHeaders.get(key);
            stringAdditionalHeaders.append(key).append("->").append(value).append("\n");
        }
        return stringAdditionalHeaders.toString();
    }
}
