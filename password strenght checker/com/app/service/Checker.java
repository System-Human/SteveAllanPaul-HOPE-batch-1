package com.app.service;

import com.app.model.Pwd;

public class Checker {
    public void check(Pwd p) {
        String v = p.val;
        int s = 0;
        if (v.length() >= 8) s++;
        if (v.matches(".*[A-Z].*")) s++;
        if (v.matches(".*[a-z].*")) s++;
        if (v.matches(".*[0-9].*")) s++;
        if (v.matches(".*[!@#$%^&*].*")) s++;
        p.scr = s;
    }

    public String getLvl(int s) {
        if (s <= 2) return "Weak";
        if (s <= 4) return "Medium";
        return "Strong";
    }
}