package com.example;

/**
 * Created by marko on 27. 02. 2017.
 */

public class Seller {
    private String IDSeller;
    private String NameSeller;
    private String ContactSeller;

    public Seller(String idSeller, String nameSeller, String contactSeller) {
        this.IDSeller = idSeller;
        this.NameSeller = nameSeller;
        this.ContactSeller = contactSeller;
    }

    public String getIDSeller() {
        return IDSeller;
    }

    public void setIDSeller(String IDSeller) {
        this.IDSeller = IDSeller;
    }

    public String getNameSeller() {
        return NameSeller;
    }

    public void setNameSeller(String nameSeller) {
        NameSeller = nameSeller;
    }

    public String getContactSeller() {
        return ContactSeller;
    }

    public void setContactSeller(String contactSeller) {
        ContactSeller = contactSeller;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "IDSeller='" + IDSeller + '\'' +
                ", NameSeller='" + NameSeller + '\'' +
                ", ContactSeller='" + ContactSeller + '\'' +
                '}';
    }
}
