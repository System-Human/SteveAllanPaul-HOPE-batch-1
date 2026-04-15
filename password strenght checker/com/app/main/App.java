package com.app.main;

import com.app.model.Pwd;
import com.app.service.Checker;
import com.app.util.Reader;

public class App {
    public static void main(String[] args) {
        Reader r = new Reader();
        Checker c = new Checker();

        String i = r.getIn("Enter password: ");
        Pwd p = new Pwd(i);
        
        c.check(p);
        
        System.out.println("Score: " + p.scr + "/5");
        System.out.println("Strength: " + c.getLvl(p.scr));
        
        r.close();
    }
}