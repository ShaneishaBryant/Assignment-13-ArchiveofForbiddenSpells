import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class SpellCaster {
    private final Random random = new Random();
    //constant variable that holds the name and destination filename for the text file
    private static final String LOG_FILE = "spell_log.txt";

    //helper method that uses try-with-resources to guarantee the file writer is closed properly
    private void logToFile(String message){
        try (PrintWriter writer = new PrintWriter(new FileWriter("spell_log.txt", true))){
            writer.println(message);
        }catch(IOException e){
            //handle I/O issues
            System.out.println("[ERROR] Failed to write to log file");
        }
    }


    //method that declares throws SpellException
    public void castSpell(String spellName) throws SpellException{
            double roll = random.nextDouble();

            //depending on what the random number is will execute a spell
            if(roll < 1.0 / 3.0){
                String msg = "Success! Spell " + spellName + " cast successfully.";
                System.out.println(msg);
                logToFile(msg);
            } else if(roll < 2.0 / 3.0) {
                String msg = "[ATTENTION MANALEAK] Spell " + spellName + " triggered ManaLeak Exception,";
                logToFile(msg);
                throw new ManaLeakException("casting --> " + spellName);
            }else{
                String msg = "[ATTENTION FIZZLE] Spell " + spellName + " triggered Fizzle Exception.";
                logToFile(msg);
                throw new FizzleException("casting --> " + spellName);
            }

    }
}
