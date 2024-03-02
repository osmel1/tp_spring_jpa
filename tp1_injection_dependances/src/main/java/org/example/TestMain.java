package org.example;

import org.example.dao.IDao;
import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Injection de dependances par XML");
        // lire le fichier de configuration Spring format Java
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        // récupérer le bean metier
        IMetier metier =(IMetier) context.getBean("metier");
        // Pour tester
        System.out.println(metier.calcul());
    }
}
