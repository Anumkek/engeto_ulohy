package com.company;

public class Main {

    private static final String INPUT_FILE = "C:\\Users\\Vojtěch\\OneDrive\\Plocha\\kvetiny.txt";


    public static void main(String[] args) {
        ImportPlants list = new ImportPlants();
        try {
            list.importPlantsFromFile(INPUT_FILE);
        } catch (PlantException e) {
            System.err.println(e.getLocalizedMessage());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.getPlants(i).getWateringInfo());
        }
    }
}
