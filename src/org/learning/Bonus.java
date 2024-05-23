package org.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a word");
        String word = scanner.nextLine();
        // Map delle occorrenze
        Map<Character, Integer> occurrences = new HashMap<>();


        // ciclo la parola
        for (int i = 0; i < word.length(); i++) {
            // carattere corrente in lowercase
           char c = Character.toLowerCase(word.charAt(i));

           // se spazio vuoto non faccio nulla
           if (c != ' ') {
               // se nelle occorrenze il carattere è già presente allora aumento il valore, altrimenti setta nuova chiave e valore a 1
                if (occurrences.containsKey(c)) {
                    occurrences.put(c, occurrences.get(c) +1);
                } else {
                    occurrences.put(c, 1);
                }
           }
        }

        System.out.println(occurrences);
        System.out.println(occurrences.isEmpty());
        // Array di sole chiavi
        Set<Character> key = occurrences.keySet();
        System.out.println(key);
    }
}
