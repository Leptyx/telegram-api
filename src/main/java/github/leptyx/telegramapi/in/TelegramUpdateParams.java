package github.leptyx.telegramapi.in;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TelegramUpdateParams {

    @JsonProperty("update_id")
    @JsonAlias("updateId") // because Telegram's callback_query buttons reply in camelCase -.-
    private Long updateId;

    @JsonProperty("message")
    private Message message;
    @JsonProperty("edited_message")
    private EditedMessage editedMessage;
    @JsonProperty("channel_post")
    private ChannelPost channelPost;
    @JsonProperty("edited_channel_post")
    private EditedChannelPost editedChannelPost;
    @JsonProperty("inline_query")
    private InlineQuery inlineQuery;
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;
    @JsonProperty("callback_query")
    @JsonAlias("callbackQuery") // because Telegram's callback_query buttons reply in camelCase (despite the doc) -.-
    private CallbackQuery callbackQuery;
    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery;
    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;
    @JsonProperty("poll")
    private Poll poll;
    @JsonProperty("poll_answer")
    private PollAnswer pollAnswer;

    public TelegramUpdateParams() {
    }

    public TelegramUpdateParams(Long updateId,
                                Message message,
                                EditedMessage editedMessage,
                                ChannelPost channelPost,
                                EditedChannelPost editedChannelPost,
                                InlineQuery inlineQuery,
                                ChosenInlineResult chosenInlineResult,
                                CallbackQuery callbackQuery,
                                ShippingQuery shippingQuery,
                                PreCheckoutQuery preCheckoutQuery,
                                Poll poll,
                                PollAnswer pollAnswer) {
        this.updateId = updateId;
        this.message = message;
        this.editedMessage = editedMessage;
        this.channelPost = channelPost;
        this.editedChannelPost = editedChannelPost;
        this.inlineQuery = inlineQuery;
        this.chosenInlineResult = chosenInlineResult;
        this.callbackQuery = callbackQuery;
        this.shippingQuery = shippingQuery;
        this.preCheckoutQuery = preCheckoutQuery;
        this.poll = poll;
        this.pollAnswer = pollAnswer;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public EditedMessage getEditedMessage() {
        return editedMessage;
    }

    public void setEditedMessage(EditedMessage editedMessage) {
        this.editedMessage = editedMessage;
    }

    public ChannelPost getChannelPost() {
        return channelPost;
    }

    public void setChannelPost(ChannelPost channelPost) {
        this.channelPost = channelPost;
    }

    public EditedChannelPost getEditedChannelPost() {
        return editedChannelPost;
    }

    public void setEditedChannelPost(EditedChannelPost editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public void setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public void setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public PollAnswer getPollAnswer() {
        return pollAnswer;
    }

    public void setPollAnswer(PollAnswer pollAnswer) {
        this.pollAnswer = pollAnswer;
    }
}
