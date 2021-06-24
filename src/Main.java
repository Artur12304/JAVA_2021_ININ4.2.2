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
    }
}
