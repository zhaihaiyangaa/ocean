package com.fh.model;

import java.util.Date;

public class Clothing {
    private Integer clo_id;
    private String  clo_trademark;
    private Integer clo_Racking;
    private Integer clo_season;
    private String  clo_person;
    private Integer clo_price;
    private Date    clo_dateTime;
    private  Integer          clo_discount;
    private String seasonNname;
    public Integer sad;

    public Integer getSad() {
        return sad;
    }

    public void setSad(Integer sad) {
        this.sad = sad;
    }

    public void sad(){

    }
    public Clothing() {

    }

    public Integer getClo_id() {
        return clo_id;
    }

    public void setClo_id(Integer clo_id) {
        this.clo_id = clo_id;
    }

    public String getClo_trademark() {
        return clo_trademark;
    }

    public void setClo_trademark(String clo_trademark) {
        this.clo_trademark = clo_trademark;
    }

    public Integer getClo_Racking() {
        return clo_Racking;
    }

    public void setClo_Racking(Integer clo_Racking) {
        this.clo_Racking = clo_Racking;
    }

    public Integer getClo_season() {
        return clo_season;
    }

    public void setClo_season(Integer clo_season) {
        this.clo_season = clo_season;
    }

    public String getClo_person() {
        return clo_person;
    }

    public void setClo_person(String clo_person) {
        this.clo_person = clo_person;
    }

    public Integer getClo_price() {
        return clo_price;
    }

    public void setClo_price(Integer clo_price) {
        this.clo_price = clo_price;
    }

    public Date getClo_dateTime() {
        return clo_dateTime;
    }

    public void setClo_dateTime(Date clo_dateTime) {
        this.clo_dateTime = clo_dateTime;
    }

    public Integer getClo_discount() {
        return clo_discount;
    }

    public void setClo_discount(Integer clo_discount) {
        this.clo_discount = clo_discount;
    }

    public Clothing(Integer clo_id, String clo_trademark, Integer clo_Racking, Integer clo_season, String clo_person, Integer clo_price, Date clo_dateTime, Integer clo_discount, String seasonNname) {
        this.clo_id = clo_id;
        this.clo_trademark = clo_trademark;
        this.clo_Racking = clo_Racking;
        this.clo_season = clo_season;
        this.clo_person = clo_person;
        this.clo_price = clo_price;
        this.clo_dateTime = clo_dateTime;
        this.clo_discount = clo_discount;
        this.seasonNname = seasonNname;
    }

    public String getSeasonNname() {
        return seasonNname;
    }

    public void setSeasonNname(String seasonNname) {
        this.seasonNname = seasonNname;
    }
}
