package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;


public class LireDictionnaire {

    public static Map<String, Integer> lireDictionnaire(BufferedReader sourceDictionnaire ) throws IOException {


        Map<String, Integer> dictionnaire = new HashMap<String, Integer>();


        String definition;
        int compteur = 0;
        while ((definition = sourceDictionnaire .readLine()) != null) {


            compteur++;
            dictionnaire.put(definition, compteur);
        }

        return dictionnaire;

    }

}
