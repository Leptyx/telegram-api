package github.leptyx.telegramapi.in;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class InlineKeyboardButton {

    @JsonProperty("text")
    private String text;

    // Optional fields

    @JsonProperty("url")
    private String url;
    @JsonProperty("login_url")
    private Object loginUrl;
    @JsonProperty("callback_data")
    // @JsonRawValue // otherwise when callbackData contains `{"object":123}` the JsonMapper will escape quotes...
    // commented because Telegram needs to receive String
    private String callbackData;
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;

    public InlineKeyboardButton() {
    }

    public InlineKeyboardButton(String text, String url, Object loginUrl, String callbackData, String switchInlineQuery, String switchInlineQueryCurrentChat) {
        this.text = text;
        this.url = url;
        this.loginUrl = loginUrl;
        this.callbackData = callbackData;
        this.switchInlineQuery = switchInlineQuery;
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(Object loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }
}
