public class Animal {
    String species;
    String name;
    double weight;

    double deafultMouseWeight = 1.0;
    double deafultLionWeight = 123.0;
    double deafultWeight = 50.0;

    public Animal(String spieces, String name){
        this.species = spieces;
        this.name = name;
        if(species.equals("mouse")){
            this.weight = deafultMouseWeight;
        }
        else if(species.equals("lion")){
            this.weight = deafultLionWeight;
        }
        else{
            this.weight = deafultWeight;
        }
    }
}
