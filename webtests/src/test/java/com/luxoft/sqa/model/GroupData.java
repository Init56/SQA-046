package com.luxoft.sqa.model;

public class GroupData {
    String name;
    String header;
    String footer;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    String id;



    public GroupData(String id, String name, String header, String footer) {
        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        if (name != null ? !name.equals(groupData.name) : groupData.name != null) return false;
        return id != null ? id.equals(groupData.id) : groupData.id == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    public GroupData(String name, String header, String footer) {
        this.id = null;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    @Override

    public String toString() {
        return "GroupData{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }





}