/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import service.menu.inter.MenuRegisterServiceInter;

/**
 *
 * @author apple
 */
public class MenuRegisterService implements MenuRegisterServiceInter{

    @Override
    public void process() {
        System.out.println("Register");    }
    
}
