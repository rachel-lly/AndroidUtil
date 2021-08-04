package com.example.androidutil.designmodel.prototype.login;

class LoginImpl implements Login{
    @Override
    public void login() {
        User user = new User();
        user.age = 22;
        user.name = "Mr.Lin";
        user.address = new Address("广东省","1","2");

        LoginSession.loginSession.setLoginedUser(user);
    }
}
