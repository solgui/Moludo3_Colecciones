package com.logic.model;

import java.util.Objects;

public class User implements Comparable<User> {

    private String nickName, passwork, email;

    public User(String nickName, String passwork, String email) {
        this.nickName = nickName;
        this.passwork = passwork;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "nickName=" + nickName + ", passwork=" + passwork + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nickName);
        hash = 97 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            final User other = (User) obj;
            if (!this.getNickName().equals(other.getNickName())) {
                return false;
            }
            return this.getNickName().equals(other.getEmail());
        }
        return false;
    }

    @Override
    public int compareTo(User o) {
//        if (this.nickName.compareTo(o.getNickName())!=0)) {
//        return this.email.compareTo(o.getEmail());            
//        }
//        return this.nickName.compareTo(o.getNickName());
        return this.compareASCII(this.getNickName(), o.getNickName());
    }

    public int compareASCII(String str1, String str2) {
        int count = str1.length() < str2.length() ? str1.length() : str2.length();
        if (!str1.equals(str2)) {
            for (int i = 0; i < count; i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return str1.charAt(i) - str2.charAt(i);
                }

            }

        }
        return 0;
    }

}
