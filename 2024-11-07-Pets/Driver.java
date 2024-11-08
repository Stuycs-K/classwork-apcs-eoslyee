/// When I made the change in the last step, now the private Animal variable, name, can now be accessed and modified. 

public class Driver{
  public static void main(String[] args){

    Animal human = new Animal("hi", 5, "bob");
    human.speak();

    Bird pigeon = new Bird("squawk", 3, "billy", 24.5, "white");
    pigeon.speak();

    // Test
    Animal a1 = new Animal("moo", 13, "ben"); 
    Bird b1 = new Bird("cacaw", 7, "merlin", 12.0, "brown"); 
    // Bird b2 = new Animal("meow", 11, "barry"); --> produced an error because Animal is the parent class of bird, you can't make an animal and call it a bird
    Animal a2 = new Bird("chirp", 2, "robin", 8.0, "red"); 
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
