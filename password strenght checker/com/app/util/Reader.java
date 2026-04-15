package com.app.util;

import java.util.Scanner;

public class Reader {
    private Scanner sc = new Scanner(System.in);

    public String getIn(String m) {
        System.out.print(m);
        return sc.nextLine();
    }

    public void close() {
        sc.close();
    }
}