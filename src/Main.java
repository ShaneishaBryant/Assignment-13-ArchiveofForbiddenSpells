import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //static method to read the log file and print to console
    public static void readLog(String fileName){
        System.out.println("Viewing Log File (" + fileName + ")");

        //try-with-resources to ensure Scanner closes automatically
        try (Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("[ERROR] That file seems to be missing.");
        }

    }


    public static void main(String[] args) {

        SpellCaster caster = new SpellCaster();

        //arrayList
        List<String> spells = new ArrayList<>();
        spells.add("Cosmo");
        spells.add("Pickleball");
        spells.add("Firestorm");
        spells.add("Shadow Bend");
        spells.add("Cloak");
        spells.add("Vortex Throw");


        //loop that iterates through each spell and call castSpell(spellName)
        for(String spellName: spells) {
            try {
                caster.castSpell(spellName);
            } catch (ManaLeakException e) {
                System.out.println("[WARNING] ManaLeak detected " + e.getMessage());
            } catch (FizzleException e) {
                System.out.println("[ATTENTION] FizzleException detected " + e.getMessage());
            } catch (SpellException e) {
                System.out.println("[ATTENTION] Spell Exception error: " + e.getMessage());
            }
        }

        //display the archive history after all spells have been cast and logged
        readLog("spell_log.txt");

        //demonstrates error handling with a non-existent file
        readLog("missing_grimoire.txt");

    }
}
