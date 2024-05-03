public class Parrot extends Bird implements Prey
{
    public Parrot(String name, String age, String heightOfFly, String special) {
        super(name, age, special, heightOfFly);
    }

    public String getSpecial() {
        return super.getSpecial();
    }

}
