public abstract class Bird extends Animal
{
    String heightOfFly;

    public Bird(String name, String age, String special ,String heightOfFly) {
        super(name, age ,special);
        this.heightOfFly = heightOfFly;
    }

    public String getHeightOfFly() {
        return heightOfFly;
    }
}
