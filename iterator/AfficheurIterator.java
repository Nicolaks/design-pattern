package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AfficheurIterator {

    public AfficheurIterator(){

    }

    public static void afficheElements(Iterator<?>  i){
        String res = "";
        while(i.hasNext()){
            res += i.next().toString() + " ";
        }
        System.out.println(res);
    }

    public static void afficheElements(Collection<?> i){
        Iterator it = i.iterator();
        afficheElements(it);
    }
}
