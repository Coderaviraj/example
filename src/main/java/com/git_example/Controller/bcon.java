package com.git_example.Controller;

public class bcon {
    public static void main(String[] args) {
        System.out.println("This is a change from bcon branch.");
        System.out.println("This is a change from main branch.");
        System.out.println("This is a change from feature branch.");
        System.out.println("This is a change from hotfix branch.");
        System.out.println("This is a change from master branch.");
        System.out.println("This is a change from develop branch.");
        System.out.println("100");

        bcon a1 = new bcon();
        int val = a1.test2();
        System.out.println(val);
    }

    private int test2() {
        return 10;
    }
}
