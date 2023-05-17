package com.example.list.model;

import java.util.SplittableRandom;

public class user {
    private int mCoLor;
    private String mName;
    private String mNumBer;
    private String mLink;
    private int status;
    public user(String mLink, String mName, String mNumBer,int   status) {
        this.mLink = mLink;
        this.mName = mName;
        this.mNumBer = mNumBer;
        this.status = status;
    }

    public String getmLink() {
        return mLink;
    }

    public void setmLink(String mLink) {
        this.mLink = mLink;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumBer() {
        return mNumBer;
    }

    public void setmNumBer(String mNumBer) {
        this.mNumBer = mNumBer;
    }

    public int getStatus() {return status;}

    public void setStatus(int status) {this.status = status;}
}
