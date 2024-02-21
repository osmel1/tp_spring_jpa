package org.example.presentationSpringAnnotation;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Injection de dependances par annotations");
        // lire le fichier de configuration Spring format Java
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.dao","org.example.metier");
        // récupérer le bean metier
        IMetier metier =(IMetier) context.getBean(IMetier.class);
        // Pour tester
        System.out.println(metier.calcul());
    }
}
