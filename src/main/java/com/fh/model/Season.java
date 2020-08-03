package com.fh.model;

public class Season {
    private Integer  id;
    private String seasonNname;

    public Season(Integer id, String seasonNname) {
        this.id = id;
        this.seasonNname = seasonNname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeasonNname() {
        return seasonNname;
    }

    public void setSeasonNname(String seasonNname) {
        this.seasonNname = seasonNname;
    }
}
