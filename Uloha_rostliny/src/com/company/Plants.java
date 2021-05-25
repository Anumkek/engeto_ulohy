package com.company;

import java.text.ParseException;
import java.time.LocalDate;

public class Plants {

    static final int DEFAULT_FREQUENCY_OF_WATERING = 7;

    private String name;
    private String notes;
    private int frequencyofWatering;
    LocalDate lastWatering;
    LocalDate planted;

    public Plants(String name, String notes, int frequencyofWatering, LocalDate lastWatering, LocalDate planted) {
        this.name = name;
        this.notes = notes;
        this.frequencyofWatering = frequencyofWatering;
        this.lastWatering = lastWatering;
        this.planted = planted;
    }

    public Plants(String name, String notes, LocalDate lastWatering) {
        this.name = name;
        this.notes = "";
        this.lastWatering = LocalDate.now();
    }

    public Plants(String name, String notes, int frequencyofWatering, LocalDate lastWatering) {
        this.name = name;
        this.notes = "";
        this.lastWatering = LocalDate.now();
        this.frequencyofWatering = DEFAULT_FREQUENCY_OF_WATERING;

    }


    public static int getDefaultFrequencyOfWatering() {
        return DEFAULT_FREQUENCY_OF_WATERING;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getFrequencyofWatering() {
        return frequencyofWatering;
    }

    public void setDefaultFrequencyOfWatering(int frequencyofWatering) throws PlantException {
        if (frequencyofWatering <= 0)
            throw new PlantException("Frekvence zalévání nesmí být menší nebo rovno 0! (Zadáno: " + frequencyofWatering + ".)");
        this.frequencyofWatering = frequencyofWatering;
    }

    public void setFrequencyofWatering(int frequencyofWatering) {
        this.frequencyofWatering = frequencyofWatering;
    }

    public LocalDate getLastWatering() {
        return lastWatering;
    }

    public void setLastWatering(LocalDate lastWatering) throws PlantException {
        LocalDate datePlanted = getPlanted();
        if (lastWatering.isBefore(datePlanted)) {
            throw new PlantException("Datum poslední zálivky " + lastWatering + " nesmí být starší než datum zasazení rostliny " + datePlanted + "!");
        }
        this.lastWatering = lastWatering;
    }


    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public String getWateringInfo() {
        return getName() + "poslední zalití" + lastWatering + "příští zalití" + lastWatering.plusDays(getFrequencyofWatering());
    }
    public static Plants parse(String text, String delimiter) throws ParseException {
        String[] items = text.split(delimiter);

        int numberOfItems = items.length;
        if (numberOfItems != 5) throw new ParseException("Nesprávný počet položek na řádku! Očekáváme 5 položek, místo "+numberOfItems+" položek na řádku: "+text, 0);

        String name = items[0];
        String notes = items[1];
        int frequencyOfWateringInDays = Integer.parseInt(items[2]);
        LocalDate lastWatering = LocalDate.parse(items[3]);
        LocalDate planted = LocalDate.parse(items[4]);

        return new Plants(name, notes, frequencyOfWateringInDays, lastWatering, planted);
    }
}

