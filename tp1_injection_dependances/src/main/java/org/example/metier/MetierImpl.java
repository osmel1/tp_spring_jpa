package org.example.metier;

import org.example.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;


    @Override
    public double calcul() {
        // Implémentation de la méthode calcul en utilisant IDao
        double temp = dao.getDate()*2;
        System.out.println("MetierImpl.calcul() appelé !");
        return temp;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
