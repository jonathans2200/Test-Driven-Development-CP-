package payment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

import ec.edu.ups.payment.PaymentGateway;
import ec.edu.ups.payment.PaymentProcessor;
import ec.edu.ups.payment.PaymentResponse;



public class PaymentProcessorTest {
    @Test
    public void give_payment_when_is_correct_then_ok() {

        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        PaymentProcessor processor = new PaymentProcessor(gateway);
        Mockito.when(gateway.requestPayment(Mockito.any())).
        thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(processor.makePayment(100));
    }

    @Test
    public void give_payment_when_is_wrong_then_error() {

        PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        PaymentProcessor processor = new PaymentProcessor(gateway);
        Mockito.when(gateway.requestPayment(Mockito.any())).
        thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.FAIL));
        assertFalse(processor.makePayment(100));
    }

}
