/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuShowStudentsServiceInter;

/**
 *
 * @author apple
 */
public class MenuShowStudentService implements MenuShowStudentsServiceInter  {

    @Override
    public void process() {
        Student[] allStudents =Config.instance().getStudents();
        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(allStudents[i]);
        }
    }
    
}
