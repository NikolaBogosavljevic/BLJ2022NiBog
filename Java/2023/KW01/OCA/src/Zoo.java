public class Zoo {
    private String animal;

    public static void main(String[] args) {
        Zoo animal = new Zoo("Bird");
        System.out.print(animal.getAnimal());
    }

    public Zoo(String animal) {
        this.animal = animal;

    }

    public String getAnimal() {
        return animal;
    }
}
