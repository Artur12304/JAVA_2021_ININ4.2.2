import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        System.out.println("Hello world!");
        Human human1 = new Human("Kamil", 12, "man");
        Human human2 = new Human("Ryszard", 50, "woman");

        Animal animal1 = new Animal("lion", "Simba");
        Animal animal2 = new Animal("mouse", "Tom");
        Animal animal3 = new Animal("fish", "Nemo");

        Phone phone1 = new Phone("iphone");
        Phone phone2 = new Phone("samsung");
        Phone phone3 = new Phone("xiaomi");

        System.out.println();
        if(animal1.weight >= animal2.weight){
            System.out.println(animal1.species+", o nazwie "+animal1.name+" i wadze "+animal1.weight+", jest ciezsze!");
        }
        else if(animal1.weight <= animal2.weight){
            System.out.println(animal2.species+", o nazwie "+animal2.name+" i wadze "+animal2.weight+", jest ciezsze!");
        }
        System.out.println();
        if(human1.age >= human2.age){
            System.out.println(human1.name+" jest starszy od "+human2.name+", o "+(human1.age - human2.age)+" lata.");
        }
        else if(human1.age <= human2.age){
            System.out.println(human2.name+" jest starszy od "+human1.name+", o "+(human2.age - human1.age)+" lata.");
        }
    }
}
