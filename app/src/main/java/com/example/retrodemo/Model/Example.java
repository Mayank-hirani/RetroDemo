
package com.example.retrodemo.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("fakeEarningPoint")
    @Expose
    private String fakeEarningPoint;
    @SerializedName("packageInstallTrackingUrl")
    @Expose
    private String packageInstallTrackingUrl;
    @SerializedName("pid")
    @Expose
    private String pid;
    @SerializedName("offer_id")
    @Expose
    private String offerId;
    @SerializedName("homeSlider")
    @Expose
    private List<HomeSlider> homeSlider;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("homeDataList")
    @Expose
    private List<HomeData> homeDataList;
    @SerializedName("adFailUrl")
    @Expose
    private String adFailUrl;
    @SerializedName("sideMenuList")
    @Expose
    private List<SideMenu> sideMenuList;
    @SerializedName("qryref")
    @Expose
    private String qryref;
    @SerializedName("earningPoint")
    @Expose
    private Object earningPoint;
    @SerializedName("pointValue")
    @Expose
    private String pointValue;
    @SerializedName("aboutUsUrl")
    @Expose
    private String aboutUsUrl;
    @SerializedName("privacyPolicy")
    @Expose
    private String privacyPolicy;
    @SerializedName("termsConditionUrl")
    @Expose
    private String termsConditionUrl;
    @SerializedName("todayDate")
    @Expose
    private String todayDate;
    @SerializedName("appVersion")
    @Expose
    private String appVersion;
    @SerializedName("appUrl")
    @Expose
    private String appUrl;
    @SerializedName("isForceUpdate")
    @Expose
    private String isForceUpdate;
    @SerializedName("updateMessage")
    @Expose
    private String updateMessage;
    @SerializedName("telegramUrl")
    @Expose
    private String telegramUrl;
    @SerializedName("youtubeUrl")
    @Expose
    private String youtubeUrl;
    @SerializedName("instagramUrl")
    @Expose
    private String instagramUrl;
    @SerializedName("celebrationLottieUrl")
    @Expose
    private String celebrationLottieUrl;
    @SerializedName("isShowPubScale")
    @Expose
    private String isShowPubScale;
    @SerializedName("loginSlider")
    @Expose
    private List<LoginSlider> loginSlider;
    @SerializedName("loginSliderWhatsApp")
    @Expose
    private List<LoginSliderWphatsApp> loginSliderWhatsApp;
    @SerializedName("rewardLabel")
    @Expose
    private String rewardLabel;
    @SerializedName("isShowAccountDeleteOption")
    @Expose
    private String isShowAccountDeleteOption;
    @SerializedName("isShowSurvey")
    @Expose
    private String isShowSurvey;
    @SerializedName("adjoeIcon")
    @Expose
    private String adjoeIcon;
    @SerializedName("isadjoeon")
    @Expose
    private String isadjoeon;
    @SerializedName("adjoeKeyHash")
    @Expose
    private String adjoeKeyHash;
    @SerializedName("imageAdjoeIcon")
    @Expose
    private String imageAdjoeIcon;
    @SerializedName("isShowPlaytimeIcon")
    @Expose
    private String isShowPlaytimeIcon;
    @SerializedName("isShowAdjoeToolBar")
    @Expose
    private String isShowAdjoeToolBar;
    @SerializedName("lovinBannerID")
    @Expose
    private List<String> lovinBannerID;
    @SerializedName("lovinInterstitialID")
    @Expose
    private List<String> lovinInterstitialID;
    @SerializedName("lovinRewardID")
    @Expose
    private List<String> lovinRewardID;
    @SerializedName("lovinAppOpenID")
    @Expose
    private List<String> lovinAppOpenID;
    @SerializedName("lovin_smallNativeID")
    @Expose
    private List<String> lovinSmallNativeID;
    @SerializedName("lovinNativeID")
    @Expose
    private List<String> lovinNativeID;
    @SerializedName("isShowAppluck")
    @Expose
    private String isShowAppluck;
    @SerializedName("isDefaultAppluck")
    @Expose
    private String isDefaultAppluck;
    @SerializedName("InterAppluckID")
    @Expose
    private String interAppluckID;
    @SerializedName("DefaultAppluckID")
    @Expose
    private String defaultAppluckID;
    @SerializedName("IncentiveAppluckID")
    @Expose
    private String incentiveAppluckID;
    @SerializedName("isAppLovinAdShow")
    @Expose
    private String isAppLovinAdShow;
    @SerializedName("isShowAdjoeLeaderboardIcon")
    @Expose
    private String isShowAdjoeLeaderboardIcon;
    @SerializedName("isShowWhatsAppAuth")
    @Expose
    private String isShowWhatsAppAuth;
    @SerializedName("points")
    @Expose
    private Object points;
    @SerializedName("isWelcomeDialog")
    @Expose
    private String isWelcomeDialog;
    @SerializedName("welcomePoint")
    @Expose
    private String welcomePoint;
    @SerializedName("encrypt")
    @Expose
    private String encrypt;

    public String getFakeEarningPoint() {
        return fakeEarningPoint;
    }

    public void setFakeEarningPoint(String fakeEarningPoint) {
        this.fakeEarningPoint = fakeEarningPoint;
    }

    public String getPackageInstallTrackingUrl() {
        return packageInstallTrackingUrl;
    }

    public void setPackageInstallTrackingUrl(String packageInstallTrackingUrl) {
        this.packageInstallTrackingUrl = packageInstallTrackingUrl;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public List<HomeSlider> getHomeSlider() {
        return homeSlider;
    }

    public void setHomeSlider(List<HomeSlider> homeSlider) {
        this.homeSlider = homeSlider;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<HomeData> getHomeDataList() {
        return homeDataList;
    }

    public void setHomeDataList(List<HomeData> homeDataList) {
        this.homeDataList = homeDataList;
    }

    public String getAdFailUrl() {
        return adFailUrl;
    }

    public void setAdFailUrl(String adFailUrl) {
        this.adFailUrl = adFailUrl;
    }

    public List<SideMenu> getSideMenuList() {
        return sideMenuList;
    }

    public void setSideMenuList(List<SideMenu> sideMenuList) {
        this.sideMenuList = sideMenuList;
    }

    public String getQryref() {
        return qryref;
    }

    public void setQryref(String qryref) {
        this.qryref = qryref;
    }

    public Object getEarningPoint() {
        return earningPoint;
    }

    public void setEarningPoint(Object earningPoint) {
        this.earningPoint = earningPoint;
    }

    public String getPointValue() {
        return pointValue;
    }

    public void setPointValue(String pointValue) {
        this.pointValue = pointValue;
    }

    public String getAboutUsUrl() {
        return aboutUsUrl;
    }

    public void setAboutUsUrl(String aboutUsUrl) {
        this.aboutUsUrl = aboutUsUrl;
    }

    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    public void setPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    public String getTermsConditionUrl() {
        return termsConditionUrl;
    }

    public void setTermsConditionUrl(String termsConditionUrl) {
        this.termsConditionUrl = termsConditionUrl;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getIsForceUpdate() {
        return isForceUpdate;
    }

    public void setIsForceUpdate(String isForceUpdate) {
        this.isForceUpdate = isForceUpdate;
    }

    public String getUpdateMessage() {
        return updateMessage;
    }

    public void setUpdateMessage(String updateMessage) {
        this.updateMessage = updateMessage;
    }

    public String getTelegramUrl() {
        return telegramUrl;
    }

    public void setTelegramUrl(String telegramUrl) {
        this.telegramUrl = telegramUrl;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getCelebrationLottieUrl() {
        return celebrationLottieUrl;
    }

    public void setCelebrationLottieUrl(String celebrationLottieUrl) {
        this.celebrationLottieUrl = celebrationLottieUrl;
    }

    public String getIsShowPubScale() {
        return isShowPubScale;
    }

    public void setIsShowPubScale(String isShowPubScale) {
        this.isShowPubScale = isShowPubScale;
    }

    public List<LoginSlider> getLoginSlider() {
        return loginSlider;
    }

    public void setLoginSlider(List<LoginSlider> loginSlider) {
        this.loginSlider = loginSlider;
    }

    public List<LoginSliderWphatsApp> getLoginSliderWhatsApp() {
        return loginSliderWhatsApp;
    }

    public void setLoginSliderWhatsApp(List<LoginSliderWphatsApp> loginSliderWhatsApp) {
        this.loginSliderWhatsApp = loginSliderWhatsApp;
    }

    public String getRewardLabel() {
        return rewardLabel;
    }

    public void setRewardLabel(String rewardLabel) {
        this.rewardLabel = rewardLabel;
    }

    public String getIsShowAccountDeleteOption() {
        return isShowAccountDeleteOption;
    }

    public void setIsShowAccountDeleteOption(String isShowAccountDeleteOption) {
        this.isShowAccountDeleteOption = isShowAccountDeleteOption;
    }

    public String getIsShowSurvey() {
        return isShowSurvey;
    }

    public void setIsShowSurvey(String isShowSurvey) {
        this.isShowSurvey = isShowSurvey;
    }

    public String getAdjoeIcon() {
        return adjoeIcon;
    }

    public void setAdjoeIcon(String adjoeIcon) {
        this.adjoeIcon = adjoeIcon;
    }

    public String getIsadjoeon() {
        return isadjoeon;
    }

    public void setIsadjoeon(String isadjoeon) {
        this.isadjoeon = isadjoeon;
    }

    public String getAdjoeKeyHash() {
        return adjoeKeyHash;
    }

    public void setAdjoeKeyHash(String adjoeKeyHash) {
        this.adjoeKeyHash = adjoeKeyHash;
    }

    public String getImageAdjoeIcon() {
        return imageAdjoeIcon;
    }

    public void setImageAdjoeIcon(String imageAdjoeIcon) {
        this.imageAdjoeIcon = imageAdjoeIcon;
    }

    public String getIsShowPlaytimeIcon() {
        return isShowPlaytimeIcon;
    }

    public void setIsShowPlaytimeIcon(String isShowPlaytimeIcon) {
        this.isShowPlaytimeIcon = isShowPlaytimeIcon;
    }

    public String getIsShowAdjoeToolBar() {
        return isShowAdjoeToolBar;
    }

    public void setIsShowAdjoeToolBar(String isShowAdjoeToolBar) {
        this.isShowAdjoeToolBar = isShowAdjoeToolBar;
    }

    public List<String> getLovinBannerID() {
        return lovinBannerID;
    }

    public void setLovinBannerID(List<String> lovinBannerID) {
        this.lovinBannerID = lovinBannerID;
    }

    public List<String> getLovinInterstitialID() {
        return lovinInterstitialID;
    }

    public void setLovinInterstitialID(List<String> lovinInterstitialID) {
        this.lovinInterstitialID = lovinInterstitialID;
    }

    public List<String> getLovinRewardID() {
        return lovinRewardID;
    }

    public void setLovinRewardID(List<String> lovinRewardID) {
        this.lovinRewardID = lovinRewardID;
    }

    public List<String> getLovinAppOpenID() {
        return lovinAppOpenID;
    }

    public void setLovinAppOpenID(List<String> lovinAppOpenID) {
        this.lovinAppOpenID = lovinAppOpenID;
    }

    public List<String> getLovinSmallNativeID() {
        return lovinSmallNativeID;
    }

    public void setLovinSmallNativeID(List<String> lovinSmallNativeID) {
        this.lovinSmallNativeID = lovinSmallNativeID;
    }

    public List<String> getLovinNativeID() {
        return lovinNativeID;
    }

    public void setLovinNativeID(List<String> lovinNativeID) {
        this.lovinNativeID = lovinNativeID;
    }

    public String getIsShowAppluck() {
        return isShowAppluck;
    }

    public void setIsShowAppluck(String isShowAppluck) {
        this.isShowAppluck = isShowAppluck;
    }

    public String getIsDefaultAppluck() {
        return isDefaultAppluck;
    }

    public void setIsDefaultAppluck(String isDefaultAppluck) {
        this.isDefaultAppluck = isDefaultAppluck;
    }

    public String getInterAppluckID() {
        return interAppluckID;
    }

    public void setInterAppluckID(String interAppluckID) {
        this.interAppluckID = interAppluckID;
    }

    public String getDefaultAppluckID() {
        return defaultAppluckID;
    }

    public void setDefaultAppluckID(String defaultAppluckID) {
        this.defaultAppluckID = defaultAppluckID;
    }

    public String getIncentiveAppluckID() {
        return incentiveAppluckID;
    }

    public void setIncentiveAppluckID(String incentiveAppluckID) {
        this.incentiveAppluckID = incentiveAppluckID;
    }

    public String getIsAppLovinAdShow() {
        return isAppLovinAdShow;
    }

    public void setIsAppLovinAdShow(String isAppLovinAdShow) {
        this.isAppLovinAdShow = isAppLovinAdShow;
    }

    public String getIsShowAdjoeLeaderboardIcon() {
        return isShowAdjoeLeaderboardIcon;
    }

    public void setIsShowAdjoeLeaderboardIcon(String isShowAdjoeLeaderboardIcon) {
        this.isShowAdjoeLeaderboardIcon = isShowAdjoeLeaderboardIcon;
    }

    public String getIsShowWhatsAppAuth() {
        return isShowWhatsAppAuth;
    }

    public void setIsShowWhatsAppAuth(String isShowWhatsAppAuth) {
        this.isShowWhatsAppAuth = isShowWhatsAppAuth;
    }

    public Object getPoints() {
        return points;
    }

    public void setPoints(Object points) {
        this.points = points;
    }

    public String getIsWelcomeDialog() {
        return isWelcomeDialog;
    }

    public void setIsWelcomeDialog(String isWelcomeDialog) {
        this.isWelcomeDialog = isWelcomeDialog;
    }

    public String getWelcomePoint() {
        return welcomePoint;
    }

    public void setWelcomePoint(String welcomePoint) {
        this.welcomePoint = welcomePoint;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

}
