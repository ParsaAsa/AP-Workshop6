public class Cheetah extends Mammal implements Hunter
{

    public Cheetah(String name, String age, String speed, String special) {
        super(name, age, special, speed);
    }
    
    @Override
    public void hunt(Prey prey) {
        System.out.println(this.getName() + " hunted " + prey.getName());
    }

    public String getSpecial() {
        return super.getSpecial();
    }
    
}
