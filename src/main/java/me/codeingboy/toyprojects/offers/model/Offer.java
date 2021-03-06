package me.codeingboy.toyprojects.offers.model;

import org.springframework.stereotype.Component;

/**
 * Model class for offer, each object correspond to a record in table "Offers"<br/>
 * Note that a user can only associate with an organization, but an organization can have one or more offers
 *
 * @author CodeingBoy
 * @version 1
 */
@Component
public class Offer {
    private int ID;
    private String name;
    private String description;
    private String headerImage;

    public Offer() {
    }

    public Offer(String name, String description, String headerImage) {
        this.name = name;
        this.description = description;
        this.headerImage = headerImage;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
