package manoj.appcomp.whatsapp_clone.Models;

public class MessageModel {

    String userId, message, messageId;
    Long timestamp;

    public MessageModel(String userId, String message, Long timestamp) {
        this.userId = userId;
        this.message = message;
        this.timestamp = timestamp;
    }

    public MessageModel(String userId, String message) {
        this.userId = userId;
        this.message = message;
    }

    public MessageModel()
    {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
