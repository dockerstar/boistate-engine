package com.dockerstar.model;

public class Biomarker {
    private String name;
    private Double value;
    private Integer unit;

    public Biomarker(String name, Double value, Integer unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Biomarker{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", unit=" + unit +
                '}';
    }
}
