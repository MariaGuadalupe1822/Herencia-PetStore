public class Dog extends Animal {
    private String sound;
    public Dog() {
    }

    public Dog(String name, String race, String type, byte age) {
        super(name, race, type, age);
    }
    public Dog(String name, String race, String type, byte age, String sound) {
        super(name, race, type, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public String toString() {
        System.out.println("El nombre es: " + getName());
        System.out.println("La raza es: " + getRace());
        System.out.println("El tipo es: " + getType());
        System.out.println("Su edad es: " + getAge());
        System.out.println("Como hace el animal"+ getSound());
        return "Soy un animal terrestre";
    }
}
