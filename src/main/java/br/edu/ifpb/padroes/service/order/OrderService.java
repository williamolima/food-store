package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;

public class OrderService {

    private EmailNotification emailNotification;

    private PaymentService paymentService;

    public void createOrder(Order order, PaymentService.PaymentType paymentType) {
        order.setStatus(Order.OrderStatus.IN_PROGRESS);
        emailNotification.sendMailNotification(String.format("Order %d canceled", order.getId()));
        try {
            paymentService.doPayment(paymentType);
            order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
            emailNotification.sendMailNotification(String.format("Order %d completed successfully", order.getId()));
        } catch (Exception e) {
            order.setStatus(Order.OrderStatus.PAYMENT_REFUSED);
            emailNotification.sendMailNotification(String.format("Order %d refused", order.getId()));
        }
    }

    public void cancelOrder(Order order) {
        order.setStatus(Order.OrderStatus.CANCELED);
        emailNotification.sendMailNotification(String.format("Order %d canceled", order.getId()));
    }

}
