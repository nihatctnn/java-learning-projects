public class Main
{

    public static void main(String[] args)
  {

      Animal a1 = new Animal("Cat", AnimalTypes.MAMMAL);
      Animal a2 = new Animal("Dove", AnimalTypes.BIRD);
      Animal a3 = new Animal("Crocodiles", AnimalTypes.REPTILE);
      Animal a4 = new Animal("Anchovy", AnimalTypes.FISH);

      Animal[] animals = {a1, a2, a3, a4};
      Zoo myZoo = new Zoo(animals);
      myZoo.printAnimals();

  }
}