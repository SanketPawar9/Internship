package day4;

import java.io.*;
import java.util.Scanner;

public class NotesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "notes.txt";

        try {
            // 1. Write notes to a file
            System.out.print("Enter a note to save: ");
            String note = sc.nextLine();

            FileWriter fw = new FileWriter(fileName, true); // append mode
            fw.write(note + "\n");
            fw.close();
            System.out.println("Note saved to file.");

            // 2. Read notes from file
            System.out.println("\n--- Reading Notes ---");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
    }
}
