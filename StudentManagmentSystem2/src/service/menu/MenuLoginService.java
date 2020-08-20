/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;

/**
 *
 * @author apple
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = sc2.next();
        if (!(username.equals("admin") && password.equals("admin94"))) {
            throw new IllegalArgumentException("username or password is not valid");

        }
        Config.setLoggedin(true);
    }

}
