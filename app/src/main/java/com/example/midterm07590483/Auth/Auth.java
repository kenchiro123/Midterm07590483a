package com.example.midterm07590483.Auth;

public class Auth {
    private static final String EMAIL = "bbb"; //**
    private static final String PASSWORD = "222"; //**


    private String musecer;
    private  String mPassword;

    public Auth(String mMail,String mPassword){
        this.musecer= mMail;
        this.mPassword = mPassword;
    }

    public String getmMail() {
        return musecer;
    }

    public void setmMail(String mMail) {
        this.musecer = mMail;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
    public boolean check(){
        if(musecer.equals(EMAIL)&&mPassword.equals(PASSWORD)){
            return true;
        }
        else{
            return  false;
        }
    }
}