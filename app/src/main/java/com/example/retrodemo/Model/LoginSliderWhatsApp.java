
package com.example.retrodemo.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LoginSliderWhatsApp {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(String screenNo) {
        this.screenNo = screenNo;
    }

}
