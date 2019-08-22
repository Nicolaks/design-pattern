package iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class MyArrayList<E> extends ArrayList{

  public MyArrayListIterator Iterator(){

    MyArrayListIterator arrayIt = new MyArrayListIterator(this);

    return arrayIt;
  }


}
