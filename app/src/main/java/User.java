/**
 * Created by marko on 27. 02. 2017.
 */

public class User {
    private String IDUser;
    private String NameOfUser;
    private String NicknameOfUser;
    private String ContactUser;

    public User(String IDUser, String nameOfUser, String nicknameOfUser, String contactUser) {
        this.IDUser = IDUser;
        this.NameOfUser = nameOfUser;
        this.NicknameOfUser = nicknameOfUser;
        this.ContactUser = contactUser;
    }

    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public String getNameOfUser() {
        return NameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        NameOfUser = nameOfUser;
    }

    public String getNicknameOfUser() {
        return NicknameOfUser;
    }

    public void setNicknameOfUser(String nicknameOfUser) {
        NicknameOfUser = nicknameOfUser;
    }

    public String getContactUser() {
        return ContactUser;
    }

    public void setContactUser(String contactUser) {
        ContactUser = contactUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "IDUser='" + IDUser + '\'' +
                ", NameOfUser='" + NameOfUser+ '\'' +
                ", ContactUser='" + ContactUser + '\'' +
                ", NicknameOfUser='" + NicknameOfUser + '\'' +
                '}';
    }
}
