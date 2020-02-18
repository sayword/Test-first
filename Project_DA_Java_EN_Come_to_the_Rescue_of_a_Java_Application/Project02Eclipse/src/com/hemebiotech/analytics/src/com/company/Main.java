package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Main {

    static BufferedWriter fp;
    public static void main(String[] args) throws IOException {

        BufferedReader sourceDictionnaire = new BufferedReader(new FileReader("/Users/benjamin/Desktop/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
        Map<String, Integer> dictionnaire = lireDictionnaire(sourceDictionnaire);
        afficherDictionnaire(dictionnaire);

    }//fin main

    private static Map<String, Integer> lireDictionnaire(BufferedReader sourceDictionnaire ) throws IOException {
        Map<String, Integer> dictionnaire = new HashMap<String, Integer>();

        String definition;
        int compteur = 0;
        while ((definition = sourceDictionnaire .readLine()) != null) {

            compteur++;
            dictionnaire.put(definition, compteur);
        }
        return dictionnaire;
    }

    private static void afficherDictionnaire(Map<String, Integer> dictionnaire) {
        System.out.println("*************************");
        System.out.println("Contenu du fichier :");
        for (Entry<String, Integer> traduction : dictionnaire.entrySet()) {

            System.out.println(traduction.getKey() + " = " + traduction.getValue());
        }
        System.out.println("*************************");
        System.out.println("");
    }



    //fp.close();

}
