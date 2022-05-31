package com.example.sm_app;

public class PostPojo {
    private float id;
    private String name;
    private String bhav;
    private float status;
    private String created_at;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBhav() {
        return bhav;
    }

    public float getStatus() {
        return status;
    }

    public String getCreated_at() {
        return created_at;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBhav(String bhav) {
        this.bhav = bhav;
    }

    public void setStatus(float status) {
        this.status = status;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
