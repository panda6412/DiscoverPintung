package com.ocean.discoverpintung.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuyouyang on 2017/5/6.
 */

public class Landspace {
    @SerializedName("Id")
    private String id ;

    @SerializedName("Catalog")
    private String catalog ;

    @SerializedName("Subject")
    private String subject ;

    @SerializedName("Lat")
    private String lat ;

    @SerializedName("Lon")
    private String lon ;

    @SerializedName("Address")
    private String address ;

    @SerializedName("Tel")
    private String tel ;

    @SerializedName("UpImageUrl")
    private String upImageUrl ;

    @SerializedName("InitDate")
    private String initDate ;

    @SerializedName("DisShow")
    private String disShow ;

    @SerializedName("Type")
    private String type ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getUpImageUrl() {
        return upImageUrl;
    }

    public void setUpImageUrl(String upImageUrl) {
        this.upImageUrl = upImageUrl;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getDisShow() {
        return disShow;
    }

    public void setDisShow(String disShow) {
        this.disShow = disShow;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
