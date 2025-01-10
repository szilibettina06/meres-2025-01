/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalapacsvetes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Kalapacsvetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File sportolokFile = new File("kalapacsvetes.txt");
            Scanner readTxt = new Scanner(sportolokFile);
            while (readTxt.hasNextLine()) {
                String data = readTxt.nextLine();
                System.out.println(data);
                System.out.println("A dobások eredménye: " +data.length()); 
            }
             readTxt.close();
            
           
        } catch (FileNotFoundException e) {
            System.out.println("Nincs adat.");
            e.printStackTrace();
        }
        
                  
        

        

       

    }
}
