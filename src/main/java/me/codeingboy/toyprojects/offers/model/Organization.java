package me.codeingboy.toyprojects.offers.model;

import org.springframework.stereotype.Component;

/**
 * Model class for organization, each correspond to a record in table "Organizations"<br/>
 * Note that a user can only associate with an organization, but an organization can have one or more offers
 *
 * @author CodeingBoy
 * @version 1
 */
@Component
public class Organization {
    private int ID;
    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
