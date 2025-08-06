package com.cams.sms.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Stock {
    @Id
    private int id;
    private String name;
    private int unit;
    private long total;

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + unit +
                ", total=" + total +
                '}';
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

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Stock(){

    }

    public Stock(int id, String name, int unit, long total) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return id == stock.id && unit == stock.unit && total == stock.total && Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, unit, total);
    }
}
