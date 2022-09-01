package OOP.Inheritance;

public class BoxWeight extends Box {
    double weight = -1;
   BoxWeight(double l, double w, double h, double weight) {
       super(l, w, h);
       this.weight = weight;
   }

    BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BoxWeight{" +
                "height= " + super.h +
                ", length= " + super.l +
                ", width= " + super.w +
                ", weight= " + weight +
                '}';
    }
}
