class UsagePromo implements Visitor {
    @Override
    public void visit(TelcoSubscription subscription) {
        System.out.println(subscription.getTelcoName() + " Data Usage Offer and price: " + subscription.getPromoPrice());
    }
}