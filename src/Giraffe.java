public class Giraffe extends Mammal implements Prey
{

    public Giraffe(String name, String age, String speed, String special) {
        super(name, age,special , speed);
    }

    public String getSpecial() {
        return super.getSpecial();
    }
    
}
