package com.luxoft.sqa.model;

public class ContactData {
    public ContactData(String firstname,String middlename) {
        this.firstname = firstname;
        this.middlename = middlename;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }


    String firstname;
    String middlename;
 }
