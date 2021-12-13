/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adopt;

/**
 *
 * @author Neha 
 */
public class AdopterDetail {
    private String ssnnumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private AddressDetails address;
    private String email;
    private AdoptionHistoryDirectory historyDirectory;

    public AdopterDetail() {
        historyDirectory = new AdoptionHistoryDirectory();
    }

    public String getSsnnumber() {
        return ssnnumber;
    }

    public void setSsnnumber(String ssnnumber) {
        this.ssnnumber = ssnnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressDetails getAddress() {
        return address;
    }

    public void setAddress(AddressDetails address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AdoptionHistoryDirectory getHistoryDirectory() {
        return historyDirectory;
    }

    public void setHistoryDirectory(AdoptionHistoryDirectory historyDirectory) {
        this.historyDirectory = historyDirectory;
    }
    
}
