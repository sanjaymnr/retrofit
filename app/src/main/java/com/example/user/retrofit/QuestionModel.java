package com.example.user.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionModel {
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Question")
    @Expose
    private String question;
    @SerializedName("OptionA")
    @Expose
    private String optionA;
    @SerializedName("OptionB")
    @Expose
    private String optionB;
    @SerializedName("OptionC")
    @Expose
    private String optionC;
    @SerializedName("OptionD")
    @Expose
    private String optionD;
    @SerializedName("Answer")
    @Expose
    private String answer;

}
