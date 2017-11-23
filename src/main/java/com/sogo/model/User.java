package com.sogo.model;


import java.util.Date;
import java.util.List;

/**
 * Created by lijinlin on 2017/11/23.
 */

public class User {
    private int id;
    private String name;
    private String passwd;
    private String cnname;
    private String email;
    private String phone;
    private String im;
    private String qq;
    private int role;
    private int creator;
    private Date created;
    private List<Post> posts;

    public User(int id, String name, String passwd) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
    }

    public User() {
    }

    public User(int id, String name, String passwd, String cnname, String email, String phone, String im, String qq, int role, int creator, Date created, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.cnname = cnname;
        this.email = email;
        this.phone = phone;
        this.im = im;
        this.qq = qq;
        this.role = role;
        this.creator = creator;
        this.created = created;
        this.posts = posts;
    }

    public User(int id, String name, String passwd, String cnname, String email, String phone, String im, String qq, int role, int creator, Date created) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.cnname = cnname;
        this.email = email;
        this.phone = phone;
        this.im = im;
        this.qq = qq;
        this.role = role;
        this.creator = creator;
        this.created = created;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", cnname='" + cnname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", im='" + im + '\'' +
                ", qq='" + qq + '\'' +
                ", role=" + role +
                ", creator=" + creator +
                ", created=" + created +
                ", posts=" + posts +
                '}';
    }
}
