package com.nhn.dooray.client;


import lombok.*;

import java.util.List;

/**
 * Dooray Messenger 가 요구하는 데이터 포멧은 json 이며 아래의 예제와 같습니다.
 * {
 *  "botName": "BotName",
 *  "botIconImage": "https://translate.nhnent.com/icon/botimage.jpg",
 *  "text":"markdown text!\n* item1\n* item2",
 *  "attachments":[{"title":"title!", "titleLink": "http://dooray.com", "text":"markdown text!!\n* item3\n* item4", "color": "darkgreen"}]
 *  }
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoorayHook {
    private String botName;
    private String botIconImage;
    private String text;
    private List<Attachment> attachments;

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Attachment{
        private String title;
        private String titleLink;
        private String text;
        private String color;
    }

}
