public class Main {
    static void main(String[] args) {

        SpellCaster spell = new SpellCaster();

        try{
            spell.castSpell("Lumos");
        }catch (ManaLeakException e){
            System.out.println(e.getMessage());
        }catch (FizzleException e){
            System.out.println("Handle Exception: " + e.getMessage());
        }catch (SpellException e){
            System.out.println("General Exception: " + e.getMessage());
        }


    }
}
