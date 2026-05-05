package com.dockerstar;

import com.dockerstar.model.Biomarker;
import com.dockerstar.model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User(0,"Dima", 20);
        User user2 = new User(1, "Renat", 21);

        Biomarker biomarker1 = new Biomarker("Test1", 30.0, 0);
        Biomarker biomarker2 = new Biomarker("Test2", 100.0, 1);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(biomarker1);
        System.out.println(biomarker2);
    }
}