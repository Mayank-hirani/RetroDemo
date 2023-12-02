
package com.example.retrodemo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginSlider {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(String screenNo) {
        this.screenNo = screenNo;
    }

}
