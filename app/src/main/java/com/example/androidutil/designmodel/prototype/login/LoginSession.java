package com.example.androidutil.designmodel.prototype.login;

class LoginSession {
    static LoginSession loginSession = null;

    private User loginedUser;

    private LoginSession() {
    }

    public static LoginSession getLoginSession(){
        if(loginSession == null){
            loginSession = new LoginSession();
        }
        return loginSession;
    }

    void setLoginedUser(User user){
        this.loginedUser = user;
    }

    public User getLoginedUser() throws CloneNotSupportedException {
        return (User) loginedUser.clone();
    }
}
