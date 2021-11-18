package com.rapid.commerce.model;

public class Discount {

       private int id;
       private String description;
       private float value;
       private boolean active;

        public Discount(int id, String description, float value, boolean active) {
            this.id = id;
            this.description = description;
            this.value = value;
            this.active = active;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
