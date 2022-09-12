public class Main {
    public static void main(String[] args) {
        VehicleType[] types = new VehicleType[4];
        types[0] = (new VehicleType("Bus", 1.2));
        types[1] = (new VehicleType("Car", 1.0));
        types[2] = (new VehicleType("Rink", 1.5));
        types[3] = (new VehicleType("Tractor", 1.2));

        types[3].setCoeffForTax(1.3);

        double max = types[0].coeffForTax;
        double sum = 0.0;
        for (VehicleType v : types) {
            v.display();
            max = v.coeffForTax > max ? v.coeffForTax : max;
            sum += v.coeffForTax;
        }
        System.out.println(max);
        double average = sum / types.length;
        System.out.println(average);
    }
}