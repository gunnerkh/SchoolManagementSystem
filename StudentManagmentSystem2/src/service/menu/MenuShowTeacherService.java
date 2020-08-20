/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menu.inter.MenuShowTeachersServiceInter;

/**
 *
 * @author apple
 */
public class MenuShowTeacherService implements MenuShowTeachersServiceInter{
    @Override
    public void process() {
        Teacher[] allTeachers =Config.instance().getTeachers();
        for (int i = 0; i < allTeachers.length; i++) {
            System.out.println(allTeachers[i]);
        }
    }
    
}
