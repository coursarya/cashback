package mobi.coursar.service;

public class CashbackService {
    public int calculate(int purchase) {
        int percent = 5;
        int cashback = purchase * percent / 100;
        int max = 3_000;
        return Math.min(cashback, max);
    }
}
