package CodeReview;

class SalesConsultant {

    //private Shop workingShop;
    private double earnedMoney;



    public SalesConsultant() {
        Shop.getInstance().addWorker(this);
    }

    public void sellProduct(double price) {
        this.earnedMoney += Math.max(price, 0);
    }

    public double getMoney() {
        return this.earnedMoney;
    }
}
