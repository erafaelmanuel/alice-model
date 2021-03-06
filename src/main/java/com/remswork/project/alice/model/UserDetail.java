package com.remswork.project.alice.model;

public class UserDetail {
	
    private long id;
    private String username;
    private String password;
    private String userType;
    private boolean isEnabled;
    private String registered;
    public static final String USER = "User/Client";
    public static final String ADMIN = "Admin";

    public UserDetail() {
        super();
    }

    public UserDetail(String username, String password, String userType, boolean isEnabled, String registered) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.isEnabled = isEnabled;
        this.registered = registered;
    }

    public UserDetail(long id, String username, String password, String userType, boolean isEnabled,
                      String registered) {
       this(username, password, userType, isEnabled, registered);
       this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

}
