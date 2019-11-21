package com.nhnent.dooray.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate 을 활용하여 DoorayHook 을 발송하는 클래스
 */
public class DoorayHookSender {

    private RestTemplate resttemplate;

    private String url;

    public DoorayHookSender(RestTemplate resttemplate, String url) {
        this.resttemplate = resttemplate;
        this.url = url;
    }

    public void send(DoorayHook doorayHook) {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<DoorayHook> entity = new HttpEntity<>(doorayHook, headers);
        ResponseEntity<String> exchange = resttemplate.exchange(url, HttpMethod.POST, entity, String.class);
    }

}
