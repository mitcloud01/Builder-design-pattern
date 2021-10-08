package Builder;

public class Shop {
    public static void main(String[] args) {
        Phone p = new Phone("ABC", "ICD", 3, 4300, 181632, 12000, true);
        System.out.println(p);
        p.toString();
        PhoneBuilder p1 = new PhoneBuilder().setProcessor("ABC").setDisplayType("IPS").setRam(4).setBattery(4000).setBenchMarkScore(204424).setPrice(19000).setIs5G(false);
        System.out.println(p1);
        p.toString();
    }
}
