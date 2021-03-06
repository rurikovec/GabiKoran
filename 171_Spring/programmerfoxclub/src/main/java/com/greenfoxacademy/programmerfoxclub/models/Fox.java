package com.greenfoxacademy.programmerfoxclub.models;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Fox {

    private String name;
    private ArrayList<String> tricks;
    private String food;
    private String drink;
    private ArrayList<String> unknownTricks;
    private ArrayList<String> actions;
    private String previousFood;
    private String previousDrink;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "-";
        this.drink = "-";
        this.unknownTricks = new ArrayList<>();
        for (Trick trick : Trick.values()) {
            unknownTricks.add(trick.toString());
        }
        actions = new ArrayList<>();
        this.previousFood = "-";
        this.previousDrink = "-";
    }

    public Fox(String name, ArrayList<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
        this.unknownTricks = new ArrayList<>();
        for (Trick trick : Trick.values()) {
            unknownTricks.add(trick.toString());
        }
        actions = new ArrayList<>();
        this.previousFood = "-";
        this.previousDrink = "-";
    }

    public void addTrick(String trick) {
        if (!tricks.contains(trick)) {
            tricks.add(trick);
            unknownTricks.remove(trick.toString());
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.previousFood = this.food;
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.previousDrink = this.drink;
        this.drink = drink;
    }

    public ArrayList<String> getActions() {
        return actions;
    }

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }

    public ArrayList<String> getUnknownTricks() {
        return unknownTricks;
    }

    public boolean tricksIsEmpty() {
        if (this.getTricks().isEmpty() || this.getTricks() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void addAction(String action) {
        Date date = new Date( );
        // ez hasonlít legjobban, de angolul írja ki, így ez így bénán néz ki:
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy. MMMM dd. hh:mm:ss ");
        SimpleDateFormat ft = new SimpleDateFormat ("dd MMM yyyy hh:mm:ss ");

        actions.add((ft.format(date)) + action);

        // Viki verzió:
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy. MMMM dd. HH:mm:ss");
//
//        actions.add((now.format(format)) + action);
    }

    public String getPreviousFood() {
        return previousFood;
    }

    public String getPreviousDrink() {
        return previousDrink;
    }

    public ArrayList<String> getLastFiveActions() {

        ArrayList<String> lastFiveActions = new ArrayList<>();

        if (this.actions.size() >= 5) {
            for (int i = (this.actions.size() - 5); i < (this.actions.size()); i++) {
                lastFiveActions.add(this.actions.get(i));
            }
        } else {
            lastFiveActions = this.actions;
        }

        return lastFiveActions;
    }
}
