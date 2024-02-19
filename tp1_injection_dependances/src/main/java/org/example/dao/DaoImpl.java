package org.example.dao;

import java.util.Date;
import java.util.Random;

public class DaoImpl implements IDao{
    @Override
    public double getDate() {
        double temp = Math.random() * 100;
        System.out.println("DaoImpl.getDate() appelé !");
        return temp;
    }

}
