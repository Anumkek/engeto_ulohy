package com.company;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportPlants {

    private static final String FILE_ITEM_DELIMITER = "\t";

    ArrayList<Plants> plants = new ArrayList<>();

    public void addPlant(Plants plant) {
        plants.add(plant);
    }
    public Plants getPlants(int index) {
        return plants.get(index);
    }
    public void removePlants(int index) {
        plants.remove(index);
    }


    public int size() {
        return plants.size();
    }

    public void importPlantsFromFile(String pathAndFile) throws PlantException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(pathAndFile)))) {
            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                lineNumber++;
                try {
                    this.addPlant(Plants.parse(record, FILE_ITEM_DELIMITER));
                } catch (ParseException e) {
                    throw new PlantException("Invalid input file: "+pathAndFile+" line "+lineNumber+": "+e.getLocalizedMessage());
                }
            }
        } catch (FileNotFoundException e) {
            throw new PlantException("Vstupní soubor "+pathAndFile+" nebyl nalezen: "+e.getLocalizedMessage());
        }
    }


    }
