package org.home.ATM.Model.Action;

public class UserNameJugde {
    public boolean judgeUserName(String username) {
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c >= '0' && c <= '9' || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                return true;
            }
            return  false;
            }
     return  false;
    }

    }