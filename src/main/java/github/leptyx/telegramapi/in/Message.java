package github.leptyx.telegramapi.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty("message_id")
    private Long messageId;
    @JsonProperty("from")
    private User user;
    @JsonProperty("chat")
    private Chat chat;
    @JsonProperty("date")
    private Long date;
    @JsonProperty("text")
    private String text;
    @JsonProperty("location")
    private Location location;
        /*
        @JsonProperty("entities")
        private List<Entity> entities;

         */

    public Message() {
    }

    public Message(Long messageId, User user, Chat chat, Long date, String text, Location location/*, List<Entity> entities*/) {
        this.messageId = messageId;
        this.user = user;
        this.chat = chat;
        this.date = date;
        this.text = text;
        this.location = location;
        /*this.entities = entities;*/
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

        /*
        public List<Entity> getEntities() {
            return entities;
        }

        public void setEntities(List<Entity> entities) {
            this.entities = entities;
        }

         */







        /*
        public class Entity {

            @JsonProperty("offset")
            private Integer offset;
            @JsonProperty("length")
            private Integer length;
            @JsonProperty("type")
            private String type;

            public Entity() {
            }

            public Entity(Integer offset, Integer length, String type) {
                this.offset = offset;
                this.length = length;
                this.type = type;
            }

            public Integer getOffset() {
                return offset;
            }

            public void setOffset(Integer offset) {
                this.offset = offset;
            }

            public Integer getLength() {
                return length;
            }

            public void setLength(Integer length) {
                this.length = length;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

         */

}