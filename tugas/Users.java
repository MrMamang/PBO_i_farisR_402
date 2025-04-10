public class Users {
    private String nama, Password;

    Users(String nama, String Password){
        this.nama = nama;
        this.Password = Password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPassword() {
        return Password;
    }


    public boolean login(String nama1, String password1){
        return (nama1.equals(nama) && password1.equals(Password));
    }

    public void displayInfo (){
        System.out.println("nama: " + getNama());
    }
}
