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


    public boolean login(String InputNama, String InputPaswwrod){
        return (InputNama.equals(nama) && InputPaswwrod.equals(Password));
    }

    public void displayInfo (){
        System.out.println("sukses is not yet");
    }

}
