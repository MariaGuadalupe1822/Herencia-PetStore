public class PetStoreApp {
    public static void main(String[] args) {
        Duck duck1 =new Duck ("Dinosaurio", "Ganso", "Pato",(byte)2);
        duck1.setSquawk("cuac,cuac");
        Dog dog1=new Dog("Kira", "Chihuahua","perro", (byte)5);
        dog1.setSound("Guau");

        System.out.println("El toString()es: "+duck1.toString());
        System.out.println("El toString()es: "+ dog1.toString());

    }
}
