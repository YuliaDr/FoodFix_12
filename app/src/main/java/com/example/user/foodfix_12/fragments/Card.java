package com.example.user.foodfix_12.fragments;

class Card {

    private final String title;
    private final String message_time;
    private final String message_pay;
    private final String message_status;
    private final String message_place;

    Card(String title, String message_time, String message_pay, String message_status, String message_place) {
        this.title = title;
        this.message_time = message_time;
        this.message_pay = message_pay;
        this.message_status = message_status;
        this.message_place = message_place;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage_time() {
        return message_time;
    }

    public String getMessage_pay() {
        return message_pay;
    }

    public String getMessage_status() {
        return message_status;
    }

    public String getMessage_place() {
        return message_place;
    }

}
