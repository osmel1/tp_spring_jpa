package org.example.presentationDyn;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            //lire le fichier config.txt
            Scanner scanner = new Scanner(new File("config.txt"));


            /*pour Dao*/
            //lire le nom de la classe Dao depuis le fichier config.txt
            String daoClassName = scanner.nextLine();
            //charger la classe Dao
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
            //afficher le résultat
            System.out.println(dao.getDate());

            /*pour Metier*/
            //lire le nom de la classe Dao depuis le fichier config.txt
            String metierClassName = scanner.nextLine();
            //charger la classe Dao
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();

            //récupérer la méthode setDao
            Method setDaoMethod = cMetier.getMethod("setDao", IDao.class);
            //appeler la méthode setDao
            setDaoMethod.invoke(metier, dao);
            //afficher le résultat
            System.out.println(metier.calcul());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
