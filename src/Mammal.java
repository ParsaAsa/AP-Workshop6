public abstract class Mammal extends Animal
 {
    String speed;
    public Mammal(String name, String age,String special, String speed) {
        super(name, age ,special);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

}
