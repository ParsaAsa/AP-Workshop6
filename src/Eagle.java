public class Eagle extends Bird implements Hunter
{

    public Eagle(String name, String age, String heightOfFly, String special) {
        super(name, age, special ,heightOfFly);
        
    }
=======


    public String getSpecial() {
        return super.getSpecial();
    }
    
    @Override
    public void hunt(Prey prey) {
        System.out.println(this.getName() + "hunted" + prey.getName());
    }
    
}
