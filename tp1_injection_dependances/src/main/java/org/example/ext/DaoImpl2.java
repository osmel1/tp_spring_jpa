package org.example.ext;

import org.example.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getDate() {
        double temp = Math.random() * 20;
        System.out.println("DaoImpl2.getDate() appelé !");
        return temp;
    }

}
