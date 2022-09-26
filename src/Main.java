public class Main {
    public static void main(String[] args) {
        VehicleType types[] = initialization();

        types[3].setCoeffForTax(1.3);

        double maxCoeffForTax = findMax(types);
        printMaxCoeffForTax(maxCoeffForTax);

        double AverageCoeffForTax = findAverage(types);
        printAverageCoeffForTax(AverageCoeffForTax);
    }

    public static VehicleType[] initialization() {
        VehicleType[] arrayOfTypes = new VehicleType[4];
        arrayOfTypes[0] = (new VehicleType("Bus", 1.2));
        arrayOfTypes[1] = (new VehicleType("Car", 1.0));
        arrayOfTypes[2] = (new VehicleType("Rink", 1.5));
        arrayOfTypes[3] = (new VehicleType("Tractor", 1.2));

        return arrayOfTypes;
    }

    public static double findMax(VehicleType types[]) {
        double max = types[0].coeffForTax;
        for (VehicleType v : types) {
            v.display();
            max = v.coeffForTax > max ? v.coeffForTax : max;
        }

        return max;
    }

    public static void printMaxCoeffForTax(double max) {
        System.out.println(max);
    }

    public static double findAverage(VehicleType types[]) {
        double sum = 0.0;
        for (VehicleType v : types) {
            v.display();
            sum += v.coeffForTax;
        }
        double average = sum / types.length;

        return average;
    }

    public static void printAverageCoeffForTax(double average) {
        System.out.println(average);
    }
}