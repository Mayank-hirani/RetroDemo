
package com.example.retrodemo.Model;

import java.lang.ref.Reference;
import java.util.List;

import com.example.retrodemo.Model.Datum;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HomeData {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("isViewAll")
    @Expose
    private String isViewAll;
    @SerializedName("isBorder")
    @Expose
    private String isBorder;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;
    @SerializedName("bgColor")
    @Expose
    private String bgColor;
    @SerializedName("data")
    @Expose
    private List<Datum> data;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("subTitle")
    @Expose
    private String subTitle;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("isActive")
    @Expose
    private String isActive;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsViewAll() {
        return isViewAll;
    }

    public void setIsViewAll(String isViewAll) {
        this.isViewAll = isViewAll;
    }

    public String getIsBorder() {
        return isBorder;
    }

    public void setIsBorder(String isBorder) {
        this.isBorder = isBorder;
    }

    public String getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(String screenNo) {
        this.screenNo = screenNo;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Reference<Object> getDataList() {
        return null;
    }
}
