package org.learning;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> presents = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("To insert a present press 1");
            System.out.println("To exit press 2");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Insert present name");
                String str = scanner.nextLine();
                presents.add(str);
            } else {
                flag = false;
            }
            System.out.println("*******************************");
            System.out.println("List length: " + presents.size());
        }

        Collections.sort(presents);
        System.out.println(presents);

        File list = new File("./resources/list.txt");
        try (FileWriter writer = new FileWriter(list, true)){
            for (String str : presents) {
                writer.write("- " + str + "\n");
            }
        } catch (IOException e) {
            System.out.println("Unable to write on file");
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
