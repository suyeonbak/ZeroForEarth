package com.example.zeroforearth;

/**
 * 사용자 계정 정보 모델 클래스
 */

public class UserAccount {
    private String idToken; // Firebase Uid (고유 토큰정보)
    private String ctmID; // 아이디
    private String ctmPwd; // 비밀번호

    public UserAccount(){ }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getCtmID() {
        return ctmID;
    }

    public void setCtmID(String ctmID) {
        this.ctmID = ctmID;
    }

    String getCtmPwd() {
        return ctmPwd;
    }

    public void setCtmPwd(String ctmPwd) {
        this.ctmPwd = ctmPwd;
    }




}
