package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;


public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "New York City");
                map.put(2, "Los Angeles");
                map.put(3, "Salt Lake City");
                map.put(4, "Dartmouth");
                map.put(5, "San Antonio");
                map.put(6, "Miami");

                Set<Integer> keys = map.keySet();
                for (Integer key:keys){
                        System.out.println(key + " "+"Represent: "+map.get(key));
                }



        }

}