package me.codeingboy.toyprojects.offers.model;

/**
 * Model class for organization, each correspond to a record in table "Organizations"<br/>
 * Note that a user can only associate with an organization, but an organization can have one or more offers
 *
 * @author CodeingBoy
 * @version 1
 */
public class Organization {
    private int ID;
    private String name;

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
