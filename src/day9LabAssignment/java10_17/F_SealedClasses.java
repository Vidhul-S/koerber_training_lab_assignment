package day9LabAssignment.java10_17;

//https://rollbar.com/blog/what-are-sealed-classes-in-java/

sealed class  Animal permits Dog, Cat{
    void sound(){
        System.out.println();
    }
}
non-sealed class Dog extends Animal{

}
final class Cat extends Animal{

}
class Human{

}
public class E_SealedClasses {
    public static void main(String[] args) {

    }
}
