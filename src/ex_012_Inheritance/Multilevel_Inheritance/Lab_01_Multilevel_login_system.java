package ex_012_Inheritance.Multilevel_Inheritance;

public class Lab_01_Multilevel_login_system {
    public static void main(String[] args) {

        SuperAdmin admin = new SuperAdmin();

        admin.login();
        admin.accessAdminPanel();
        admin.shutdownSystem();



    }
}
