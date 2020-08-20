/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import util.FileUtility;

/**
 *
 * @author apple
 */
public class Config implements Serializable {
    private static Config config = null;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean loggedin;
  

    public static void initialize() {
        Object obj = FileUtility.readFileDeserialize("aap.obj");
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void appendStudent(Student s) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = s;
        students = newStudents;
    }

    public static void saveFile() {
        FileUtility.writeObjectToFile(Config.instance(), "app.obj");
    }

    public void appendTeacher(Teacher t) {
        Teacher[] newTeachers = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeachers[i] = teachers[i];
        }
        newTeachers[newTeachers.length - 1] = t;
        teachers = newTeachers;
    }

    public static Config instance() {
        if (config == null) {
            config = new Config();

        }
        return config;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedin() {
        return loggedin;
    }

    public static void setLoggedin(boolean loggedin) {
        Config.loggedin = loggedin;
    }

}
