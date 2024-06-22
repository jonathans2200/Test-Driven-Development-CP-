package ec.edu.ups.payment;

public class PaymentResponse {
    public enum PaymentStatus {
        OK,
        FAIL
    }

    private final PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
