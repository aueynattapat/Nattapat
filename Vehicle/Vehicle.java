class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getBaseCost() {
        return baseCost;
    }
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void createNewVehicleRecord() {
        System.out.println("New vehicle record created: " + name + " (" + year + ")");
    }

    @Override
    public String toString() {
        return "Vehicle [Serial No: " + serialNumber + ", Name: " + name + ", Model: " + model + 
               ", Year: " + year + ", Manufacturer: " + manufacturer + ", Base Cost: $" + baseCost + "]";
    }
}

