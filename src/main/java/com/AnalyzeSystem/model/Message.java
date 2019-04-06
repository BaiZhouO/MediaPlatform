package com.AnalyzeSystem.model;

import java.util.Date;

public class Message {
    private String messageId;
    private String userId;
    private Date time;
    private String content;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        DataUtil.checkLength(messageId,45);
        this.messageId = messageId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        DataUtil.checkLength(userId,45);
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
