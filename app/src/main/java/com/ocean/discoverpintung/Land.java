package com.ocean.discoverpintung;

/**
 * Created by liuyouyang on 2017/5/7.
 */

public class Land {

    private String title ;
    private String address ;
    private String imageUrl ;

    public Land(String title  , String address ,String imageUrl){
        this.title = title ;
        this.address = address ;
        this.imageUrl = imageUrl ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



}
