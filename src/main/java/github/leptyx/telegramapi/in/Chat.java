package github.leptyx.telegramapi.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("username")
    private String username;
    @JsonProperty("type")
    private String type;

    public Chat() {
    }

    public Chat(Long id, String firstName, String username, String type) {
        this.id = id;
        this.firstName = firstName;
        this.username = username;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}