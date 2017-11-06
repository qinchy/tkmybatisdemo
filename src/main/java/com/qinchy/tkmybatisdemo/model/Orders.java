package com.qinchy.tkmybatisdemo.model;

import javax.persistence.*;

public class Orders {
    @Id
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    private Integer sataus;

    private String note;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return customer_id
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * @return sataus
     */
    public Integer getSataus() {
        return sataus;
    }

    /**
     * @param sataus
     */
    public void setSataus(Integer sataus) {
        this.sataus = sataus;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}