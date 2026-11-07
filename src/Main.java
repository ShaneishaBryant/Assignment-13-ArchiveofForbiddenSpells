import java.util.ArrayList;
import java.util.List;

public class Main {
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

    }
}
