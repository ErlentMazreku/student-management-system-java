import java.time.LocalDate;

public class Payments {

    private int paymentId;
    private double amount;
    private LocalDate paymentDate;
    private String method;

    public Payments(int paymentId, double amount,
                    LocalDate paymentDate, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

}
