package com.Bridgelabz;

public class Contactbook {
    private String firstName;
    private String lastName;
    private String address;
    private String cityName;
    private String stateName;
    private int zipCode;
    private long phoneNumber;
    private String email;

    public Contactbook(String fN,String lN, String adR, String city,
                       String state, int zip, long pN, String eM ) {
        firstName = fN;
        lastName = lN;
        address = adR;
        cityName = city;
        stateName = state;
        zipCode = zip;
        phoneNumber = pN;
        email = eM;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return cityName;
    }

    public String getState() {
        return stateName;
    }

    public int getZip() {
        return zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "firstName: " + firstName +
                "Last Name: " +lastName +
                "Address: " +address +
                "City: " +cityName +
                "Zip Code: " +zipCode +
                "phone Number: " +phoneNumber +
                "Email id: " +email ;

    }
}
