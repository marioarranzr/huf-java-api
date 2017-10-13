package com.enxendra.huf.api.model.shared;

public class Attachment {

    public Long id;
    public String content;
    public String name;
    public String mime;

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public String getMime() {
        return mime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

}
