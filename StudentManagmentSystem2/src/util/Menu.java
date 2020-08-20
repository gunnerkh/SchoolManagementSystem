package util;

import bean.Config;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import service.menu.inter.MenuService;

public enum Menu {
    LOGIN(1, "1.Login", new MenuLoginService()),
    REGISTER(2, "2.Register", new MenuRegisterService()),
    ADD_TEACHER(3, "3.Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "4.Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "5.Show all Student", new MenuShowStudentService()),
    SHOW_ALL_STUDENT(6, "6.Show all Teacher", new MenuShowTeacherService()),
    UNKNOWN;
    private int number;
    private String label;
    private MenuService service;
    
    Menu() {
        
    }
    
    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }
    
    public String getLabel() {
        return label;
    }
    
    @Override
    public String toString() {
        return label;
    }
    
    public void process() {
        service.process();
        MenuUtil.showMenu();
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return UNKNOWN;
    }
    
    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedin()) {
                        System.out.println(menus[i]);
                    }
                    
                } else if (Config.isLoggedin()) {
                    System.out.println(menus[i]);
                }
                
            }
        }
    }
}
