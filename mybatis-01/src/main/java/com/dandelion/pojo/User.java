package com.dandelion.pojo;

public class User {
    private int id;
    private String name;
    private String pswd;
    private String addr_provence;
    private String addr_city;
    private String cons;
    private String motto;

    public User() {
    }

    public User(int id, String name, String pswd) {
        this.id = id;
        this.name = name;
        this.pswd = pswd;
    }

    public User(String name, String pswd, String addr_provence, String addr_city, String cons, String motto) {
        this.name = name;
        this.pswd = pswd;
        this.addr_provence = addr_provence;
        this.addr_city = addr_city;
        this.cons = cons;
        this.motto = motto;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPswd() {
        return pswd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public void setAddr_provence(String addr_provence) {
        this.addr_provence = addr_provence;
    }

    public void setAddr_city(String addr_city) {
        this.addr_city = addr_city;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getAddr_provence() {
        return addr_provence;
    }

    public String getAddr_city() {
        return addr_city;
    }

    public String getCons() {
        return cons;
    }

    public String getMotto() {
        return motto;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pswd='" + pswd + '\'' +
                '}';
    }
}
