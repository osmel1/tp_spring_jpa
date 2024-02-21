package org.example;

import org.example.dao.IDao;
import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Injection de dependances par annotations");
        // lire le fichier de configuration Spring format Java
        ApplicationContext context = new AnnotationConfigApplicationContext();

        // récupérer le bean metier
        IDao metier = (IDao) context.getBean("base");
        // Pour tester
        //System.out.println(metier.calcul());
    }
}
