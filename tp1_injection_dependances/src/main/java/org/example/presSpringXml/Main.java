package org.example.presSpringXml;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // lire le fichier de configuration Spring format XML
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        // récupérer le bean metier
        IMetier metier = (IMetier) context.getBean("metier");
        // Pour tester
        System.out.println(metier.calcul());
    }
}
