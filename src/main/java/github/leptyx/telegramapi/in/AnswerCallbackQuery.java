package github.leptyx.telegramapi.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnswerCallbackQuery {

    @JsonProperty("ok")
    private Boolean ok;
    @JsonProperty("result")
    private Boolean result;

    public AnswerCallbackQuery(Boolean ok, Boolean result) {
        this.ok = ok;
        this.result = result;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
