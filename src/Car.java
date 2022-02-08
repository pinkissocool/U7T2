public class Car {
    private String model;
    private int miles;

    public Car(String model, int miles){
        this.miles = miles;
        this.model = model;
    }

    public String toString(){
        return model + " " + miles + "mi";
    }
}
