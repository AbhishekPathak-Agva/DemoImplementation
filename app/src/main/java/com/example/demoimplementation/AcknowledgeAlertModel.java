package com.example.demoimplementation;

public class AcknowledgeAlertModel {

    private String message;
    private String code;
    private String date;
    private int priority;
    private int color;

    public AcknowledgeAlertModel(String message, String code, String date, int priority, int color) {
        this.message = message;
        this.code = code;
        this.date = date;
        this.priority = priority;
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
