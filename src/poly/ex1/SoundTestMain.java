package poly.ex1;

public class SoundTestMain {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();
        Animal[] aniArr = {cow, dog};

        for(Animal animal: aniArr) {
            animal.sound();
        }
    }
}
