
package com.example.retrodemo.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("appId")
    @Expose
    private String appId;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("jsonImage")
    @Expose
    private String jsonImage;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("screenNo")
    @Expose
    private String screenNo;
    @SerializedName("btnName")
    @Expose
    private String btnName;
    @SerializedName("btnColor")
    @Expose
    private String btnColor;
    @SerializedName("btnTextColor")
    @Expose
    private String btnTextColor;
    @SerializedName("sliderIndex")
    @Expose
    private String sliderIndex;
    @SerializedName("bgColor")
    @Expose
    private String bgColor;
    @SerializedName("lable")
    @Expose
    private String lable;
    @SerializedName("lableColor")
    @Expose
    private String lableColor;
    @SerializedName("offerId")
    @Expose
    private String offerId;
    @SerializedName("gameId")
    @Expose
    private String gameId;
    @SerializedName("taskId")
    @Expose
    private String taskId;
    @SerializedName("isActive")
    @Expose
    private String isActive;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("entryDate")
    @Expose
    private String entryDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("displayImage")
    @Expose
    private String displayImage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getJsonImage() {
        return jsonImage;
    }

    public void setJsonImage(String jsonImage) {
        this.jsonImage = jsonImage;
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

    public String getBtnName() {
        return btnName;
    }

    public void setBtnName(String btnName) {
        this.btnName = btnName;
    }

    public String getBtnColor() {
        return btnColor;
    }

    public void setBtnColor(String btnColor) {
        this.btnColor = btnColor;
    }

    public String getBtnTextColor() {
        return btnTextColor;
    }

    public void setBtnTextColor(String btnTextColor) {
        this.btnTextColor = btnTextColor;
    }

    public String getSliderIndex() {
        return sliderIndex;
    }

    public void setSliderIndex(String sliderIndex) {
        this.sliderIndex = sliderIndex;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getLableColor() {
        return lableColor;
    }

    public void setLableColor(String lableColor) {
        this.lableColor = lableColor;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDisplayImage() {
        return displayImage;
    }

    public void setDisplayImage(String displayImage) {
        this.displayImage = displayImage;
    }

}
