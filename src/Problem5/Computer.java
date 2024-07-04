package Problem5;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return ramSize == computer.ramSize &&
                Double.compare(computer.processorSpeed, processorSpeed) == 0 &&
                manufacturer.equals(computer.manufacturer) &&
                processor.equals(computer.processor);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturer.hashCode();
        result = 31 * result + processor.hashCode();
        result = 31 * result + ramSize;
        temp = Double.doubleToLongBits(processorSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }

    public static void main(String[] args) {
        Computer comp1 = new Computer("Dell", "Intel", 16, 2.5);
        Computer comp2 = new Computer("HP", "AMD", 16, 2.5);
        Computer comp3 = new Computer("Mac", "M1", 16, 2.5);

        System.out.println("Computer 1: " + comp1);
        System.out.println("Computer 2: " + comp2);
        System.out.println("Computer 3: " + comp3);

        System.out.println("Computer 1 equals Computer 2: " + comp1.equals(comp2));
        System.out.println("Computer 1 equals Computer 3: " + comp1.equals(comp3));

        System.out.println("Computer 1 hash code: " + comp1.hashCode());
        System.out.println("Computer 2 hash code: " + comp2.hashCode());
        System.out.println("Computer 3 hash code: " + comp3.hashCode());
    }
}
