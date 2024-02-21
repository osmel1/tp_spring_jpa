package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
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
