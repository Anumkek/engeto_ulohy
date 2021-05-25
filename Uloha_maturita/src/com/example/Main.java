package com.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Maturita student1;
        Maturita student2;

        student1 = new Maturita("Jan Novak", LocalDate.of(1991, 05, 06), "4A", 5, 2, 3, 1, "prosel", "neprosel");
        student2 = new Maturita("Petr Pesek", LocalDate.of(1990, 05, 06), "3A", 1, 2, 3, 1, "prosel", "neprosel");

        System.out.println("Jméno: " + student1.getName());
        System.out.println("Datum Narození: " + student1.getDateOfBirth());
        System.out.println("Třída: " + student1.getSchoolCLass());
        System.out.println("Chemie: " + student1.getChemistry());
        System.out.println("Dějepis: " + student1.getHistory());
        System.out.println("Matematika " + student1.getMathematic());
        System.out.println("Jazyk: " + student1.getLanguage());

        if (student1.getMathematic() == 5 || student1.getChemistry() == 5 || student1.getHistory() == 5 || student1.getLanguage() == 5) {
            System.out.println("Neprošel");
        } else {
            System.out.println("Prošel");
        }


        System.out.println();

        System.out.println("Jméno: " + student2.getName());
        System.out.println("Datum Narození: " + student2.getDateOfBirth());
        System.out.println("Třída: " + student2.getSchoolCLass());
        System.out.println("Chemie: " + student2.getChemistry());
        System.out.println("Dějepis: " + student2.getHistory());
        System.out.println("Matematika: " + student2.getMathematic());
        System.out.println("Jazyk: " + student2.getLanguage());


        if (student2.getMathematic() == 5 || student2.getChemistry() == 5 || student2.getHistory() == 5 || student2.getLanguage() == 5) {
            System.out.println("Neprošel");
        } else {
            System.out.println("Prošel");
        }

    }
}