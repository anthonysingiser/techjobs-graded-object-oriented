package org.launchcode.techjobs.oo;

public abstract class JobField {
    private String value;

    public JobField() {
    }

    public JobField(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}