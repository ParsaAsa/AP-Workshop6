import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		Animal giraffe = new Giraffe("giraffe", "13", "60kph", "long neck");
		Animal youngParrot = new Parrot("youngParrot", "8", "200m", "speaking like humans");
		Animal oldParrot = new Parrot("oldParrot", "17", "150m", "speaking better than humans");
		Animal cheetah = new Cheetah("cheetah", "6", "120kph", "the fast");
		Animal eagle = new Eagle("eagle", "12", "1200m", "king of the sky");
		HashSet<Animal> animals = new HashSet<>();
		animals.add(eagle);
		animals.add(giraffe);
		animals.add(youngParrot);
		animals.add(oldParrot);
		animals.add(cheetah);
		for (Animal animal : animals) 
		{
			System.out.println("animals:");
			if (animal instanceof Mammal)
			{
				System.out.println("name: " + animal.getName() +"// age: " + animal.getAge() +"//speed: " + ((Mammal)animal).getSpeed() + "//special: " +animal.getSpecial());
			}else{
				System.out.println("name: " + animal.getName() +"// age: " + animal.getAge() +"//fly height: " + ((Bird)animal).getHeightOfFly() + "//special: " +animal.getSpecial());

			}
		}
		System.out.println("//////////////////////////////");
		((Cheetah)cheetah).hunt((Prey)youngParrot);
		((Eagle)eagle).hunt((Prey)oldParrot);
	}

}
