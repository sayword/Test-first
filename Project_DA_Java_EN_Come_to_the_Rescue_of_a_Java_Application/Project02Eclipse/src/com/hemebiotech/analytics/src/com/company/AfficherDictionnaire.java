package com.company;

import java.util.Map;


public class AfficherDictionnaire {

    public static void afficherDictionnaire(Map<String, Integer> dictionnaire) {


        System.out.println("*************************");
        System.out.println("Contenu du fichier :");


        for (Map.Entry<String, Integer> traduction : dictionnaire.entrySet()) {


            System.out.println(traduction.getKey() + " = " + traduction.getValue());

        }


        System.out.println("*************************");
        System.out.println("");


    }
}
