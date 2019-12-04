package ApplicationLogic;


import java.text.DecimalFormat;

public class Square extends Vorm {
    private double length, width;

    public Square(double length, double width) {
        this.name = "Square";
        this.length = length;
        this.width = width;

        this.volume = this.calculateVolume();
    }


    @Override
    public double calculateVolume() {
        return this.length * this.width;
    }

    @Override
    public String printInfo() {
        return "       Type: " + name + " l " + length + " w " + width + " Volume = " + (double) Math.round(volume * 100) / 100;
    }

    @Override
    public double getVolume() {
        return (double) Math.round(volume * 100) / 100;
    }
}


//class unkown {
//    public static void main(String[] args) {
//
//        Square square = new Square(20,20);
//        System.out.println(square.printInfo());
//
//    }
//}