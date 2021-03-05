package com.dev.practice2.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity
public class Alien {
    @Id
    private Integer aid;
    private String aname;

    public Alien(){

    }

    public Alien(Integer aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}
