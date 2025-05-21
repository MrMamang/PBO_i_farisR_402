package com.pratikum.users;

public abstract class Users {

    protected String nama, Password;

    protected Users(String nama, String Password){
        this.nama = nama;
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    protected abstract void displayAppMenu();
    protected abstract void logout();
    public abstract boolean login(String InputNama, String InputPassword);
    protected abstract boolean prosesLogin(String InputNama, String InputPassword);

}
