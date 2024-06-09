package com.advikaavyan.examples.containerusingjib;

public enum LoggerEnum {
    LOG_PREFIX("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    private String value;

    public String getText(){
        return  value;
    }
    private LoggerEnum(String value) {
        this.value = value;
    }
}
