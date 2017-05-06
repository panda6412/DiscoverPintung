package com.ocean.discoverpintung.DTO;


import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.Streams;
import com.ocean.discoverpintung.infos;

public class trivago {
    private Infos[] info;

    @SerializedName("Add")

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    private String add;

    @SerializedName("Class")

    public String getLass() {
        return lass;
    }

    public void setLass(String lass) {
        this.lass = lass;
    }

    private String lass;

    @SerializedName("Description")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    @SerializedName("Fax")

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    private String fax;

    @SerializedName("Gov")

    public String getGov() {
        return gov;
    }

    public void setGov(String gov) {
        this.gov = gov;
    }

    private String gov;

    @SerializedName("Grade")

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private String grade;

    @SerializedName("Id")

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    @SerializedName("Map")

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    private String map;

    @SerializedName("Name")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @SerializedName("Parkinginfo")

    public String getParkinginfo() {
        return parkinginfo;
    }

    public void setParkinginfo(String parkinginfo) {
        this.parkinginfo = parkinginfo;
    }

    private String parkinginfo;

    @SerializedName("Picdescribe1")

    public String getPicdescribe1() {
        return picdescribe1;
    }

    public void setPicdescribe1(String picdescribe1) {
        this.picdescribe1 = picdescribe1;
    }

    private String picdescribe1;

    @SerializedName("Picdescribe2")

    public String getPicdescribe2() {
        return picdescribe2;
    }

    public void setPicdescribe2(String picdescribe2) {
        this.picdescribe2 = picdescribe2;
    }

    private String picdescribe2;

    @SerializedName("Picdescribe3")

    public String getPicdescribe3() {
        return picdescribe3;
    }

    public void setPicdescribe3(String picdescribe3) {
        this.picdescribe3 = picdescribe3;
    }

    private String picdescribe3;

    @SerializedName("Picture1")

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    private String picture1;

    @SerializedName("Picture2")

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture2() {
        return picture2;
    }

    private String picture2;

    @SerializedName("Picture3")

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getPicture3() {
        return picture3;
    }

    private String picture3;

    @SerializedName("Serviceinfo")

    public String getServiceinfo() {
        return serviceinfo;
    }

    public void setServiceinfo(String serviceinfo) {
        this.serviceinfo = serviceinfo;
    }

    private String serviceinfo;

    @SerializedName("Space")

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    private String space;

    @SerializedName("Tel")

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    private String tel;

    @SerializedName("Website")

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    private String website;

    @SerializedName("Zipcode")

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    private String zipcode;
    public void setInfo(infos[] info)
    {
        this.info = info;
    }

    public trivago[] getinfo()
    {
        return info;
    }

}
