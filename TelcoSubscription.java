interface TelcoSubscription {
    String getTelcoName();
    int getPromoPrice();
    boolean getUnliCallText();
    void accept(Visitor visitor);
}