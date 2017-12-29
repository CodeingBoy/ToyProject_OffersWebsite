package me.codeingboy.toyprojects.offers.model;

import java.util.List;

/**
 * Model class for roles, each correspond to a record in table "Role"
 *
 * @author CodeingBoy
 * @version 1
 */
public class Role {
    private int ID;
    private String name;
    private List<Permission> permissionList;

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

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
}
