//Babita Thapa
// CSC 360
// Assignment6

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Declare the class name
public class Assignment6 {
    // Start the main method
    public static void main(String[] args) throws FileNotFoundException{
    // Create the file object
        File file = new File("out1.txt");
    // Create the scanner object
        Scanner input = new Scanner(file);
        ArrayList<String> words = new ArrayList<>();
        while(input.hasNext()){
             String word = input.next();

             if (Character.isAlphabetic(word.charAt(0))) {
                 words.add(word);
             }
        }
        // Sort words
             Collections.sort(words);
        // Display each word in ascending order
        System.out.println("Words in ascending order are: ");
        for (String string: words){
            System.out.println(string);
        }
        input.close();
    }
}
