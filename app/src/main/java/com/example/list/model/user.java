package com.example.list.model;

import java.util.SplittableRandom;

public class user {
    private int mCoLor;
    private String mName;
    private String mNumBer;
    private int status;
    public user(int mCoLor, String mName, String mNumBer,int status) {
        this.mCoLor = mCoLor;
        this.mName = mName;
        this.mNumBer = mNumBer;
        this.status = status;
    }

    public int getmCoLor() {
        return mCoLor;
    }

    public void setmCoLor(int mCoLor) {
        this.mCoLor = mCoLor;
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
