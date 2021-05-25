package com.example;

import java.time.LocalDate;

public class Maturita {
    private String name;
    private LocalDate dateOfBirth;
    private String schoolCLass;
    private int mathematic;
    private int language;
    private int chemistry;
    private int history;
    private String prosel;
    private String neprosel;

    public Maturita(String name, LocalDate dateOfBirth, String schoolCLass, int mathematic, int language, int chemistry, int history, String prosel, String neprosel) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.schoolCLass = schoolCLass;
        this.mathematic = mathematic;
        this.language = language;
        this.chemistry = chemistry;
        this.history = history;
        this.prosel = prosel;
        this.neprosel = neprosel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSchoolCLass() {
        return schoolCLass;
    }

    public void setSchoolCLass(String schoolCLass) {
        this.schoolCLass = schoolCLass;
    }

    public int getMathematic() {
        return mathematic;
    }

    public void setMathematic(int mathematic) {
        this.mathematic = mathematic;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public String getProsel() {
        return prosel;

    }

    public void setProsel(String prosel) {
        this.prosel = prosel;
    }

    public String getNeprosel() {
        return neprosel;
    }

    public void setNeprosel(String neprosel) {
        this.neprosel = neprosel;
    }

}