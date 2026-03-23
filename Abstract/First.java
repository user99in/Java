abstract class First{
    abstract void Sound();

}
class Dog extends First{
    void Sound(){
        System.out.println("Woof");
    }
}

class cow extends First{
    void Sound(){
        System.out.println("Moo");
    }
}
class Main{
    public static void main(String[] args) {
        First f1 = new Dog();
        First f2 = new cow();
        f1.Sound();
        f2.Sound();
    }
}