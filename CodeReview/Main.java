package CodeReview;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SalesConsultant grocerySeller = new SalesConsultant();
        SalesConsultant onlineSeller = new SalesConsultant();

        MarketingSpecialist grocerySpecialist = new MarketingSpecialist();
        MarketingSpecialist onlineSpecialist = new MarketingSpecialist();

        grocerySeller.sellProduct(500.0);
        onlineSeller.sellProduct(100.0);
        grocerySpecialist.spendMoney(100.0);
        onlineSpecialist.spendMoney(80.0);

        Shop shop = Shop.getInstance();
        double turnover = shop.getTurnover();
        System.out.println("Shop turnover: " +turnover);

    }
}
