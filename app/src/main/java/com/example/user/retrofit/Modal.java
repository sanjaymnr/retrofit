package com.example.user.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Modal {
    @SerializedName("category")
    @Expose
    public String category;
    @SerializedName("price")
    @Expose
    public Double price;
    @SerializedName("instructions")
    @Expose
    public String instructions;
    @SerializedName("photo")
    @Expose
    public String photo;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("productId")
    @Expose
    public Integer productId;
}
