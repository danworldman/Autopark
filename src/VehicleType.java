public class VehicleType {
    String typeName;
    double coeffForTax;

    public VehicleType() {
        typeName = "";
        coeffForTax = 0.0;
    }

    public VehicleType(String typeName, double coeffForTax) {
        this.typeName = typeName;
        this.coeffForTax = coeffForTax;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getCoeffForTax() {
        return coeffForTax;
    }

    public void setCoeffForTax(double coeffForTax) {
        this.coeffForTax = coeffForTax;
    }

    public void display() {
        System.out.println("typeName = " + typeName);
        System.out.println("taxCoefficient = " + coeffForTax);
    }

    public void getString(String name, double coeffForTax) {
        System.out.println(name + "," + "\"" + coeffForTax + "\"");
    }
}