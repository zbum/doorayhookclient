package com.nhnent.dooray.client;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

/**
 * @author jibumjung
 * @since
 */
public class DoorayHookSenderTest {

    @Test
    public void sendTest() throws Exception {
        DoorayHook doorayHook = new DoorayHook();
        doorayHook.setBotName("test");
        doorayHook.setText("test!!");

        DoorayHookSender doorayHookSender = new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/1387695619080878080/1996189887212547744/k5xwWNlDSyeSPepE5VwdnQ");
        doorayHookSender.send(doorayHook);
    }
}