import java.util.Scanner;
import java.util.ArrayList;

public class AnimalApp {
    public static void main(String [] args) {
        String petType = "";
        String petName = "";
        String petDescription = "";


        Scanner keyboard = new Scanner(System.in);
        ArrayList<Animal> pets = new ArrayList<Animal>();

        Dog dog = new Dog();


        System.out.println("What is the type of your dog? ");
        petType = keyboard.nextLine();
        dog.setType(petType);
        System.out.println(("What is the name of your dog? "));
        petName = keyboard.nextLine();
        dog.setName(petName);
        System.out.println("Description of your dog?");
        petDescription = keyboard.nextLine();
        dog.setDescription(petDescription);
        pets.add(dog);

        Dog dog2 = new Dog();


        System.out.println("What is the type of your dog?");
        petType = keyboard.nextLine();
        dog2.setType(petType);
        System.out.println(("What is the name of your dog? "));
        petName = keyboard.nextLine();
        dog2.setName(petName);
        System.out.println("Description of your dog?");
        petDescription = keyboard.nextLine();
        dog2.setDescription(petDescription);
        pets.add(dog2);

        Dog dog3 = new Dog();


        System.out.println("What is the type of your dog?");
        petType = keyboard.nextLine();
        dog3.setType(petType);
        System.out.println(("What is the name of your dog? "));
        petName = keyboard.nextLine();
        dog3.setName(petName);
        System.out.println("Description of your dog?");
        petDescription = keyboard.nextLine();
        dog3.setDescription(petDescription);
        pets.add(dog3);


        Cat cat = new Cat();


        System.out.println("What is the type of your cat?");
        petType = keyboard.nextLine();
        cat.setType(petType);
        System.out.println(("What is the name of your cat? "));
        petName = keyboard.nextLine();
        cat.setName(petName);
        System.out.println("Description of your cat?");
        petDescription = keyboard.nextLine();
        cat.setDescription(petDescription);
        pets.add(cat);

        Cat cat2 = new Cat();


        System.out.println("What is the type of your cat?");
        petType = keyboard.nextLine();
        cat2.setType(petType);
        System.out.println(("What is the name of your cat? "));
        petName = keyboard.nextLine();
        cat2.setName(petName);
        System.out.println("Description of your cat?");
        petDescription = keyboard.nextLine();
        cat2.setDescription(petDescription);
        pets.add(cat2);

        Cat cat3 = new Cat();


        System.out.println("What is the type of your cat?");
        petType = keyboard.nextLine();
        cat3.setType(petType);
        System.out.println(("What is the name of your cat? "));
        petName = keyboard.nextLine();
        cat3.setName(petName);
        System.out.println("Description of your cat?");
        petDescription = keyboard.nextLine();
        cat3.setDescription(petDescription);
        pets.add(cat3);


        for(int i = 0; i<pets.size(); i++){
            System.out.println(pets.get(i).getPet());

        }



        /*if(petType.equalsIgnoreCase("Dog")) {

            System.out.println(("What is the name of your Dog? "));
            petName = keyboard.nextLine();
            System.out.println("Description of your pet?");
            petDescription = keyboard.nextLine();

        }*/



    }
}
