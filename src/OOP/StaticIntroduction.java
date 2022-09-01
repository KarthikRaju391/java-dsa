package OOP;

public class StaticIntroduction {

    // This class being "static" is not dependent on the object instance of "StaticIntroduction"
    // But these classes can itself have more than one instances of themselves
    static class Sample {
        String name;
        public Sample(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
       Sample a = new Sample("Karthik");
       Sample b = new Sample("Arvind");

       System.out.println(a.name);
       System.out.println(b.name);
    }
}
