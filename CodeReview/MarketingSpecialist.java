package CodeReview;

class MarketingSpecialist {
    private double budget = 5000.00;

    public MarketingSpecialist() {
        Shop.getInstance().addWorker(this);
    }

    public void spendMoney(double marketingCampaignCost) {
        this.budget -= Math.max(marketingCampaignCost, 0);
    }

    public double getBudget() {
        return this.budget;
    }
}
