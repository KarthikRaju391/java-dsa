package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
//        System.out.println(b1);
        Box b2 = new BoxWeight(10, 15, 20, 69);

        System.out.println(b2);


        // this can't be done because java will create the object of the reference type
        // here, the reference type is of the child class and the object I am trying to create is of type
        // Box. Since Box is the parent class, it won't have access to child's properties(weight)
        // Hence, the error.
//        BoxWeight box = new Box();

        // this can be done because as we know, java will create an object of the reference type
        // The reference type here is of Box. And since the object type we are creating is of
        // child class(BoxWeight), we know that the child properties can and will inherit the
        // parent's properties and hence, no error.
//        Box box1 = new BoxWeight(10, 40, 15, 8);

    }
}
