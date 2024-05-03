public abstract class Animal 
{
    private String name;
    private String age;
    private String special;

    public Animal(String name, String age ,String special) {
        this.name = name;
        this.age = age;
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
    public String getSpecial()
    {
        return special;
    }
}
