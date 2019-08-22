package iterator;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] arg){
        ArrayList<String> array = new ArrayList<String>();
        MyArrayList<String> myArray = new MyArrayList<String>();

        array.add("Test");
        array.add("d'un itérateur");

        myArray.add("Second");
        myArray.add("Test d'un itérateur avec MyArrayList");


        MyArrayListIterator ArrayIterator = new MyArrayListIterator(array);
        System.out.println(ArrayIterator.hasNext());
        System.out.println(ArrayIterator.next());

        AfficheurIterator affiche = new AfficheurIterator();
        affiche.afficheElements(array);

        MyArrayListIterator myArrayIterator = new MyArrayListIterator(myArray);
        System.out.println(myArrayIterator.hasNext());
        System.out.println(myArrayIterator.next());

        affiche.afficheElements(myArray);

    }
}
