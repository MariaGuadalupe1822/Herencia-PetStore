public class Duck extends Animal {
    private String Squawk;

    public Duck() {
    }
    public Duck(String name, String race, String type, byte age) {
        super(name, race, type, age);
    }
    public Duck(String name, String race, String type, byte age, String squawk) {
        super(name, race, type, age);
        Squawk = squawk;
    }
    public String getSquawk() {
        return Squawk;
    }
    public void setSquawk(String squawk) {
        Squawk = squawk;
    }
    public String toString() {
        System.out.println("El nombre es: " + getName());
        System.out.println("La raza es: " + getRace());
        System.out.println("El tipo es: " + getType());
        System.out.println("Su edad es: " + getAge());
        System.out.println("Como hace el animal"+ getSquawk());
        return "Soy un animal terrestre y acuifero";
    }
}
