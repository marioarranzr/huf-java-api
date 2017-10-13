package com.enxendra.huf.api.model.shared;

public class Sender extends Party {

    private String web_url;
    private String logo;

    public String getWebUrl() {
        return web_url;
    }

    public String getLogo() {
        return logo;
    }

    public void setWebUrl(String web_url) {
        this.web_url = web_url;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
