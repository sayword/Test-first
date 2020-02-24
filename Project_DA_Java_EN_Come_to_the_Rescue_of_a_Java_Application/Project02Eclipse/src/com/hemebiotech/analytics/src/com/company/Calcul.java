package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;


import static com.company.AfficherDictionnaire.afficherDictionnaire;
import static com.company.LireDictionnaire.lireDictionnaire;


public class Calcul {


    static BufferedWriter fp;
    public static void main(String[] args) throws IOException {


        BufferedReader sourceDictionnaire = new BufferedReader(new FileReader("/Users/benjamin/Desktop/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
        Map<String, Integer> dictionnaire = lireDictionnaire(sourceDictionnaire);
        afficherDictionnaire(dictionnaire);


    }//fin main


}
