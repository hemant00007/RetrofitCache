package com.example.retrofit_cache;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Partner {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("cp_code")
    @Expose
    private String cpCode;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("gst")
    @Expose
    private String gst;
    @SerializedName("business_name")
    @Expose
    private String businessName;
    @SerializedName("business_address")
    @Expose
    private String businessAddress;
    @SerializedName("business_pincode")
    @Expose
    private String businessPincode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpCode() {
        return cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessPincode() {
        return businessPincode;
    }

    public void setBusinessPincode(String businessPincode) {
        this.businessPincode = businessPincode;
    }

}
