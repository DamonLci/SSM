package org.home.Genreic;

public class GenericImp<I> implements GenericInterface<I> {
    @Override
    public I test(I i) {
        return null;
    }

    public <T> T GenericImp(T ts) {
        T t = ts;
        return t;
    }

    public static void main(String[] args) {
        int i = new GenericImp<>().GenericImp(111);
        System.out.println(i);
        GenericImp ge = new GenericImp();
        //ge.add(11.1,22.2);
    }
/*    public  GenericImp<? extends Number> add(GenericImp<? extends Number> a,GenericImp<? extends Number> b){

        return s;
    }*/
}
