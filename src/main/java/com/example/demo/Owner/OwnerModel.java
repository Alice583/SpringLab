package com.example.demo.Owner;


import com.vladmihalcea.hibernate.type.array.IntArrayType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.mapping.List;

import java.sql.Array;
import java.sql.Date;

@Entity
@Table(name = "owner")
public class OwnerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "listcats")
    @Type(value = IntArrayType.class)
    private int[] listcats;

    public OwnerModel () {}

    public OwnerModel(int id, String name, Date birthday, int[] listcats) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.listcats = listcats;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int[] getListcats() {
        return listcats;
    }

    public void setListcats(int[] listcats) {
        this.listcats = listcats;
    }

    @Override
    public String toString() {
        return "OwnerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", listcats=" + listcats +
                '}';
    }
}
