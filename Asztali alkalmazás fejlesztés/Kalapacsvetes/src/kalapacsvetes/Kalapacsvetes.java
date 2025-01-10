/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalapacsvetes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



/**
 *
 * @author MSI
 */
public class Kalapacsvetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      
       // 3. Fájl beolvasása
        try (BufferedReader br = Files.newBufferedReader(Paths.get("kalapacsvetes.txt"))) {
            // Az első sor az oszlopok neve, azt kihagyjuk
            String sor = br.readLine();
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(";");
                int helyezes = Integer.parseInt(adatok[0]);
                double eredmeny = Double.parseDouble(adatok[1].replace(",", "."));
                String sportolo = adatok[2];
                String orszagkod = adatok[3];
                String helyszin = adatok[4];
                String datum = adatok[5];
                Sportolo.add(new Sportolo(helyezes, helyezes, sportolo, orszagkod, helyszin, helyezes));
            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl beolvasása közben: " + e.getMessage());
            return;
        }

        // 4. Dobások száma
        System.out.println("Dobások száma: " + Sportolo.size());

     /*   // 5. Magyar sportolók átlagának kiszámítása
        double hunAtlag = Sportolo.stream()
                .filter(s -> s.getOrszagkod().equals("HUN"))
                .mapToDouble(Sportolo::getEredmeny)
                .average()
                .orElse(0.0);
        System.out.printf("Magyar sportolók átlagos eredménye: %.2f%n", hunAtlag);

        // 6. Legjobb dobások
        List<Sportolo> legjobbak = Sportolo.stream()
                .sorted(Comparator.comparingDouble(Sportolo::getEredmeny).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Legjobb dobások:");
        legjobbak.forEach(s -> System.out.println(s.getSportolo() + " - " + s.getEredmeny()));

        // 7. Országonkénti statisztika a legjobb dobások alapján
        Map<String, Long> orszagStatisztika = legjobbak.stream()
                .collect(Collectors.groupingBy(Sportolo::getOrszagkod, Collectors.counting()));
        System.out.println("Országonkénti statisztika a legjobb dobásokról:");
        orszagStatisztika.forEach((orszag, db) -> System.out.println(orszag + ": " + db + " dobás"));
*/
        // 8. Magyar sportolók eredményeinek mentése
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("magyarok.txt"))) {
            Iterable<Sportolo> Sportolo = null;
            for (Sportolo s : Sportolo) {
                if (s.getOrszagkod().equals("HUN")) {
                    bw.write(s.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl írása közben: " + e.getMessage());
        }
        
                  
        

        

       

    }
}
