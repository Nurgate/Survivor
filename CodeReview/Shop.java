package CodeReview;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static Shop instance;
    private final List<Object> workers = new ArrayList<>();

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public void addWorker(Object worker) {
        this.workers.add(worker);
    }

    public double getTurnover() {
        double turnOver = 0.0;
        for (Object worker : workers) {
            if (worker instanceof SalesConsultant) {
                turnOver += ((SalesConsultant) worker).getMoney();
            } if (worker instanceof MarketingSpecialist) {
                turnOver += (( MarketingSpecialist)worker).getBudget();
            }
        }

        return turnOver;
    }
}

