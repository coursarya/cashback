package mobi.coursar;

import mobi.coursar.service.CashbackService;

public class Main {
    public static void main(String[] args) {
        CashbackService service = new CashbackService();
        int result = service.calculate(1_000);
        System.out.println(result);
    }
}
