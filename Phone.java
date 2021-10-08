package Builder;

public class Phone {
    private String Processor;
    private String DisplayType;
    private int ram;
    private int battery;
    private int BenchMarkScore;
    private float Price;
    private boolean Is5G;

    public Phone(String Processor, String DisplayType, int ram, int battery, int BenchMarkScore, float Price, boolean Is5G) {
        this.Processor = Processor;
        this.DisplayType = DisplayType;
        this.ram = ram;
        this.battery = battery;
        this.BenchMarkScore = BenchMarkScore;
        this.Price = Price;
        this.Is5G = Is5G;
    }

    @Override
    public String toString() {
        return "Phone {" +
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
