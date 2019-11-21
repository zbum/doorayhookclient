package com.nhnent.dooray.client;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * DoorayHookSender 가 정상적으로 메시지를 보내는지 테스트 합니다.
 * https://nhntechedu.dooray.com/messenger 에 student 로 로그인 해서 확인할 수 있습니다. (패스워드는 따로 연락 주세요. jibum.jung@gmail.com)
 *
 * @author jibumjung
 * @since
 */
public class DoorayHookSenderTest {

    static final String DOORAY_HOOK_URL = "https://hook.dooray.com/services/2617274018201142259/2617279287265373870/kN2S16uWT4aw7-bM5Gylmg";

    @Test
    public void sendTest() {
        DoorayHook doorayHook
                = DoorayHook.builder()
                .botName("DoorayHookSender")
                .botIconImage("https://www.manty.co.kr/images/ext/manty_logo_2019.png")
                .text("안녕하세요. DoorayHookSender 로 보내는 메시지 입니다.")
                .build();

        DoorayHookSender doorayHookSender = new DoorayHookSender(new RestTemplate(), DOORAY_HOOK_URL);
        doorayHookSender.send(doorayHook);
    }
}