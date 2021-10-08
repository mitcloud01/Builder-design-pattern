package Builder;

public class PhoneBuilder {
    private String Processor;
    private String DisplayType;
    private int ram;
    private int battery;
    private int BenchMarkScore;
    private float Price;
    private boolean Is5G;

    public PhoneBuilder setProcessor(String processor) {
        Processor = processor;
        return this;
    }

    public PhoneBuilder setDisplayType(String displayType) {
        DisplayType = displayType;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setBenchMarkScore(int benchMarkScore) {
        BenchMarkScore = benchMarkScore;
        return this;
    }

    public PhoneBuilder setPrice(float price) {
        Price = price;
        return this;
    }

    public PhoneBuilder setIs5G(boolean is5G) {
        Is5G = is5G;
        return this;
    }

    @Override
    public String toString() {
        return "PhoneBuilder {" +
                "Processor='" + Processor + '\'' +
                ", DisplayType='" + DisplayType + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", BenchMarkScore=" + BenchMarkScore +
                ", Price=" + Price +
                ", Is5G=" + Is5G +
                '}';
    }
}
