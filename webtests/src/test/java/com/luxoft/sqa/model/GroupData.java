package com.luxoft.sqa.model;

public class GroupData {
    private String name;
     private String header;
    private String footer;
    int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public GroupData(int id, String name, String header, String footer) {
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

        return name != null ? name.equals(groupData.name) : groupData.name == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public GroupData(String name, String header, String footer) {
        this.id = Integer.MAX_VALUE;
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