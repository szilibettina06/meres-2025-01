/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalapacsvetes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Kalapacsvetes {

    public static void main(String[] args) {
        try {
            File sportolokFile = new File("kalapacsvetes.txt");
            Scanner readTxt = new Scanner(sportolokFile);
            while (readTxt.hasNextLine()) {
                String data = readTxt.nextLine();
                System.out.println(data);
            }
            readTxt.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
