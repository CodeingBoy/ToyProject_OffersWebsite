package me.codeingboy.toyprojects.offers.model;

import org.springframework.stereotype.Component;

/**
 * Model class for offer's applications, each correspond to a record in table "OfferApplications"
 *
 * @author CodeingBoy
 * @version 1
 */
@Component
public class OfferApplication {
    private int ID;
    private User user;
    private Offer offer;
    private String name;
    private int age;
    private String contact;
    private char gender; // 1 - male, 2 - female
    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
