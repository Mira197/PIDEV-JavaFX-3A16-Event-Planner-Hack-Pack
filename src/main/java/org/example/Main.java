package org.example;


import tn.edu.esprit.tools.DataSource;

import java.util.List;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataSource.getInstance();
        DataSource.getInstance();
        DataSource.getInstance();
        DataSource.getInstance();
        DataSource.getInstance();
        ServicePersonne servicePersonne = new ServicePersonne();
        Personne p = new Personne("dheker","laadhibi");
        Personne p1 = new Personne("amira","bbbb");
        Personne p2 = new Personne("nour","aaaa");
        Personne p3 = new Personne("spongbob","cccccc");
        servicePersonne.ajouter(p1);
        System.out.println("Personne ajoutée avec succès.");

        servicePersonne.ajouter(p);
        System.out.println("Personne ajoutée avec succès.");
        servicePersonne.ajouter(p2);
        System.out.println("Personne ajoutée avec succès.");


        servicePersonne.ajouter(p3);
        System.out.println("Personne ajoutée avec succès.");

        List<Personne> personnes = servicePersonne.getAll(p1);
        for (Personne pp: personnes) {
            System.out.println("ID: " + pp.getId() + " | Nom: " + pp.getNom() + " | Prénom: " + pp.getPrenom());
        }
    }


    }


