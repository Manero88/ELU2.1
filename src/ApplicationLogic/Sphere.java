package ApplicationLogic;

public class Sphere extends Vorm {

    private final double radius;


    public Sphere(double radius) {
        this.name = "Sphere";
        this.radius = radius;

        this.volume = calculateVolume();
    }

    @Override
    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(this.radius,3);
    }

    @Override
    public String printInfo() {
        return "       Type: " + name + " r " + radius + " Volume " + (double) Math.round(volume * 100) / 100;
    }

    @Override
    public double getVolume() {
        return (double) Math.round(volume * 100) / 100;
    }
}
