public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);

        Visitor promo = new UsagePromo();
        Visitor unli = new UnliCallOffer();

        smart.accept(promo);
        globe.accept(promo);
        ditto.accept(promo);

        smart.accept(unli);
        globe.accept(unli);
        ditto.accept(unli);
    }
}