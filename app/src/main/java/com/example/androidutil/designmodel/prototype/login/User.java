package com.example.androidutil.designmodel.prototype.login;

import androidx.annotation.NonNull;

class User implements Cloneable{
    public int age;
    public String name;
    public String phoneName;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", address=" + address +
                '}';
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        return user;
    }
}
