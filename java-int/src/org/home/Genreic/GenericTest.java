package org.home.Genreic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest<I,S> {
    private I i;
    private S s;

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        GenericTest<Integer,String> ge=new GenericTest<Integer, String>();
        ge.setI(11);
        System.out.println(ge.getI());

    }
}
