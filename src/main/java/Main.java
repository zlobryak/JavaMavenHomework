public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(50100, false);
        System.out.println(bonus);
    }
    // Manual test file
}
