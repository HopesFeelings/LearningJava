package ex_014_Encapsulation;

public class Lab_01_encapsulation {

    public static void main(String[] args) {
        Account obj = new Account("Gaurav",5000);

        Boolean isAdmin = false;

        System.out.println(obj.getBal());
        obj.setBal(50000,isAdmin);
    }

}


class Account {

    public String getName() {
        return name;
    }

    public void setName(String name_new) {
        this.name = name_new;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal_new, Boolean isAdmin) {

        if(isAdmin)
        {
            this.bal = bal_new;
        }
        else
        {
            System.out.println("Sorry, you can't change");
        }

    }


    Account(String name_new, int bal_new) {
        this.name = name_new;
        this.bal = bal_new;
    }

    private String name;
    private int bal;



}