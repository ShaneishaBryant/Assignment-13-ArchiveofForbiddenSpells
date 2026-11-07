import java.util.Random;

public class SpellCaster {
    private final Random random = new Random();

    //method that declares throws SpellException
    public void castSpell(String spellName) throws SpellException{
            double roll = random.nextDouble();

            if(roll < 1.0 / 3.0){
                System.out.println("Success! The spell " + spellName + " has been casted!");
            } else if(roll < 2.0 / 3.0) {
                throw new ManaLeakException("casting --> " + spellName);
            }else{
                throw new FizzleException("casting --> " + spellName);
            }

    }
}
