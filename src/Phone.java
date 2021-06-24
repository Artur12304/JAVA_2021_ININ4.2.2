public class Phone {
    String brand;
    boolean has5g;
    boolean hasJack;

    public Phone(String brand){
        this.brand = brand;
        if(brand.equals("samsung")){
            this.has5g = false;
            this.hasJack = true;
        }
        else if(brand.equals("iphone")){
            this.has5g = true;
            this.hasJack = false;
        }
        else{
            this.has5g = false;
            this.hasJack = false;
        }
    }
}
