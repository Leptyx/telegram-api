package github.leptyx.telegramapi.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallbackQuery {

    @JsonProperty("id")
    private Long id; // Unique identifier for this query. Use it when calling answerCallbackQuery, so TG knows which query PokeFlare is answering
    @JsonProperty("from")
    private User from;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
    @JsonProperty("chat_instance")
    private String chatInstance;
    @JsonProperty("data")
    private String data;
    @JsonProperty("game_short_name")
    private String gameShortName;

    public CallbackQuery() {
    }

    public CallbackQuery(Long id, User user, Message message, String inlineMessageId, String chatInstance, String data, String gameShortName) {
        this.id = id;
        this.from = user;
        this.message = message;
        this.inlineMessageId = inlineMessageId;
        this.chatInstance = chatInstance;
        this.data = data;
        this.gameShortName = gameShortName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }
}
