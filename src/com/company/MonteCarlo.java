package com.company;
import java.util.*;

/**
 * Created by tk304 on 11/27/18.
 */
public class MonteCarlo {

    public double h = 0, k = 0, r = 0;
    private Random rndm = new Random();

    public MonteCarlo(double h, double k, double r)
    {
        this.h = h;
        this.k = k;
        this.r = r;
    }

    public double nextRainDrop_x()
    {
        return rndm.nextInt((int)(h * k));
    }

}
