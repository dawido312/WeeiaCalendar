package com.example.revert.demo;

public class CalendarEvent {
    private  String day;
    private String eventName;

    public CalendarEvent(String day, String eventName) {
        this.day = day;
        this.eventName = eventName;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDay() {
        return day;
    }

    public String getEventName() {
        return eventName;
    }

}
