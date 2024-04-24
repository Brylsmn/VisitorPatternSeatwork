class UnliCallOffer implements Visitor {
    @Override
    public void visit(TelcoSubscription subscription) {
        System.out.println(subscription.getTelcoName() + " unlimited calls and text package: " + subscription.getUnliCallText());
    }
}