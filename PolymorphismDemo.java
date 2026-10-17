class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a; // reference variable

        a = new Dog();
        a.sound(); // calls Dog's sound()

        a = new Cat();
        a.sound(); // calls Cat's sound()
    }
}
