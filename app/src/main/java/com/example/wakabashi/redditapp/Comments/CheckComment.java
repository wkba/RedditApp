package com.example.wakabashi.redditapp.Comments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wakabashi on 2017/06/26.
 */

public class CheckComment {
    @SerializedName("success")
    @Expose
    private String success;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "CheckComment{" +
                "success='" + success + '\'' +
                '}';
    }
}

