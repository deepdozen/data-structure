package com.app.list.arraylist;

import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;

/*
 * https://stackoverflow.com/questions/2762093/java-compare-two-lists
 * 
 */

public class Repeated {
      public static void main( String  [] args ) {

          Collection<String> listOne = Arrays.asList("milan","iga",
                                                    "dingo","iga",
                                                    "elpha","iga",
                                                    "hafil","iga",
                                                    "meat","iga", 
                                                    "neeta.peeta","iga");

          Collection<String> listTwo = Arrays.asList("hafil",
                                                     "iga",
                                                     "binga", 
                                                     "mike", 
                                                     "dingo","dingo","dingo");

          Collection<String> similar = new HashSet<String>( listOne );
          Collection<String> different = new HashSet<String>();
          different.addAll( listOne );
          different.addAll( listTwo );

          similar.retainAll( listTwo );
          different.removeAll( similar );

          System.out.printf("One:%s%nTwo:%s%nSimilar:%s%nDifferent:%s%n", listOne, listTwo, similar, different);
      }
}
