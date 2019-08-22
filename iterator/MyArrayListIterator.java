package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListIterator implements Iterator {

    private ArrayList<?> array = new ArrayList<>();
    private int indice = 0;
    int nb_elements;

    public MyArrayListIterator(ArrayList<?> array){
        this.array = array;
        this.nb_elements = this.array.size();
    }

    @Override
    public boolean hasNext() {
        return this.indice < this.array.size();
    }

    @Override
    public Object next() {
        this.indice += 1;
        if(this.hasNext()){
            return this.array.get(this.indice - 1);
        }
        throw new UnsupportedOperationException("Not supported yet. ");
    }

    @Override
    public void remove() {
        this.array.remove(indice);
    }
}
