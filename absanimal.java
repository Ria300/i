abstract class Animal
{
String breed;
String color;
abstract public void eat();
public void speak()
{};
}

class Dog extends Animal
{
public void speak(String breed,String color)
{
this.breed=breed;
this.color=color;
}
public void eat()
{
System.out.println("Dog");
System.out.println("Color= "+color+ " Breed="+breed);
}
}

class Cat extends Animal
{
public void speak(String breed,String color)
{
this.breed=breed;
this.color=color;
}
public void eat()
{
System.out.println("Cat");
System.out.println("Color= "+color+ " Breed= "+breed);
}
}

class absanimal
{
public static void main(String args[])
{
Dog d=new Dog();
Cat c=new Cat();
d.speak("German Sheffard","Black");
c.speak("Munchkin Cat","Orange");
d.eat();
c.eat();
}
}