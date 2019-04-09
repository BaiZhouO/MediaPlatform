package com.AnalyzeSystem.model;

public class User {

    private String userId;
    private String userName;
    private String password;
    private String sequenceId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        DataUtil.checkLength(userId,45);
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        DataUtil.checkLength(userName,45);
        this.userName = userName;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        DataUtil.checkLength(password,45);
        this.password = password;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        DataUtil.checkLength(sequenceId,45);
        this.sequenceId = sequenceId;
    }

}
