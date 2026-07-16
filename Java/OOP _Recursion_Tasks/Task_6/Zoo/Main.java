package Task6.Zoo;

import Task6.Animals.Animal;

public class Main {
    static void main(String[] args) {
        Animal animal = new Animal();
        animal.publicMethod();
//        animal.protectedMethod();  Metodu işləmir çünki protected metodu varislikdə əl çatan olur hər class üçün deyil
//        animal.privateMethod();  Metodu işləmir çünki private metodu yanlız Animal class-ına aid-dir
//        animal.defaultMethod();  Metodu işləmir çünki yanlız eyni paket daxilində görünür
    }
}
